package com.moviedom.app.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.moviedom.app.model.Customers;
import com.moviedom.app.model.Theaters;
import com.moviedom.app.repository.TheatersRepository;

@Controller
public class TheaterController {

	@Autowired
	TheatersRepository repository;

	@RequestMapping("/theaters")
	public String theatersLogin()
	{
		return "theaters/Theaters_login.jsp";
	}


	@RequestMapping("/theatersSignup")
	public String theatersSignup()
	{
		return "theaters/Theaters_signup.jsp";
	}
	
	@RequestMapping("/gotoHome")
	public String gotoHome()
	{
		return "Index.jsp";
	}

	@RequestMapping("/checkTheatersLogin")
	public ModelAndView checkTheater(@RequestParam("email") String email,@RequestParam("password") String password)
	{
		Theaters theater=repository.findByEmailAndPassword(email,password);

		if(Objects.isNull(theater))
		{
			ModelAndView mv = new ModelAndView();
			String message="Email or password is wrong, Not a user? please do signup";
			mv.addObject("message", message);
			mv.setViewName("theaters/Theaters_login.jsp");
			return mv;
		}
		else
		{
			ModelAndView mv = new ModelAndView("theaters/Add_movies.jsp");
			return mv;
		}

	}

	@RequestMapping("/addTheater")
	public ModelAndView addTheater(Theaters theater)
	{
		try {
			repository.save(theater);
			ModelAndView mv = new ModelAndView();
			String message="Signup Done, you can login now";
			mv.addObject("message", message);
			mv.setViewName("theaters/Theaters_login.jsp");
			return mv;
		}
		catch(Exception e)
		{
			ModelAndView mv = new ModelAndView();
			String message="You are already a user, please use different mail id";
			mv.addObject("message", message);
			mv.setViewName("theaters/Theaters_signup.jsp");
			return mv;
		}
	}


}
