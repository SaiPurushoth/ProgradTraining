package com.moviedom.app.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String login()
	{
		return "users/Login.jsp";
	}

	@RequestMapping("/signup")
	public String signup()
	{
		return "users/Signup.jsp";
	}

	@RequestMapping("/checkLogin")
	public ModelAndView checkUser(@RequestParam("email") String email,@RequestParam("password") String password)
	{
		Customers user=repository.findByEmailAndPassword(email,password);

		if(Objects.isNull(user))
		{
			ModelAndView mv = new ModelAndView();
			String message="Email or password is wrong, Not a user? please do signup";
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

	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(Customers user)
	{
		try {
			repository.save(user);
			
			
			ModelAndView mv = new ModelAndView();
			
			String message="Signup Done,";
			mv.addObject("message", message);
			mv.setViewName("users/Login.jsp");
			return mv;
		}
		catch(Exception e)
		{
			ModelAndView mv = new ModelAndView();
			String message="You are already a user, please use different mail id";
			mv.addObject("message", message);
			mv.setViewName("users/Signup.jsp");
			return mv;
		}
	}
}
