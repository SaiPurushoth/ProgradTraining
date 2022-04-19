package com.moviedom.app.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.moviedom.app.model.Customers;
import com.moviedom.app.repository.CustomerRepository;

@Controller
public class CustomerController {

	@Autowired
	CustomerRepository repository;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/login")
	public String login()
	{
		return "users/Login.jsp";
	}

	@PostMapping("/checkLogin")
	public ModelAndView checkUser(@RequestParam("email") String email,@RequestParam("password") String password)
	{
		Customers user=repository.findByEmailAndPassword(email,password);

		if(Objects.isNull(user))
		{
			ModelAndView mv = new ModelAndView();
			String message="Email or password is wrong,please do signup";
			mv.addObject("message", message);
			mv.setViewName("users/Login.jsp");
			return mv;
		}
		else
		{
			ModelAndView mv = new ModelAndView("Index.jsp");
			return mv;
		}

	}

	@PostMapping("/addCustomer")
	public ModelAndView addCustomer(Customers user)
	{
		try {
			repository.save(user);
			
			
			ModelAndView mv = new ModelAndView();
			
			String message="Signup Done,Login Now";
			mv.addObject("message", message);
			mv.setViewName("users/Login.jsp");
			return mv;
		}
		catch(Exception e)
		{
			ModelAndView mv = new ModelAndView();
			String message="You are already a user,use different mail id";
			mv.addObject("message", message);
			mv.setViewName("users/Login.jsp");
			return mv;
		}
	}
}
