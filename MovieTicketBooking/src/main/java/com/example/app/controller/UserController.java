package com.example.app.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.app.models.UserDTO;
import com.example.app.service.CookieService;
import com.example.app.service.MyUserDetailsService;
import com.example.app.utils.JwtUtil;

@Controller
public class UserController {

    @Autowired
	private MyUserDetailsService userDetailsService;
	
    @Autowired
    private JwtUtil jwtTokenUtil;
    
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	CookieService cookieService;

	@GetMapping("/login")
	public String login(){	
		return "Login.jsp";
}
	@GetMapping("/signup")
	public String signup(){	
		return "Signup.jsp";
}
	
	@PostMapping("/register")
	public ModelAndView saveUser(UserDTO user) throws Exception {
		try {
		userDetailsService.save(user);

		ModelAndView mv = new ModelAndView();
		
		String message="Signup Done,You can login";
		mv.addObject("message", message);
		mv.setViewName("Login.jsp");
		return mv;
		}
		catch(Exception e)
		{
			ModelAndView mv = new ModelAndView();
			String message="You are already a user, please use different mail id";
			mv.addObject("message", message);
			mv.setViewName("Signup.jsp");
			return mv;
		}
}
	
	
	@PostMapping("/checkLogin")
	public ModelAndView checkUser(@RequestParam("username") String email,@RequestParam("password") String password,HttpServletResponse resp) throws Exception {
		
		
		try {
			ModelAndView mv = new ModelAndView("redirect:/");
			authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(email, password));
			
			final UserDetails userDetails = userDetailsService.loadUserByUsername(email);
			
			final String jwt = jwtTokenUtil.generateToken(userDetails);
			
			resp.addCookie(cookieService.getJwtCookie(jwt));
			
			return mv;	
	        }	
		catch(BadCredentialsException e) {
			
			ModelAndView mv = new ModelAndView();
			String message="Invalid: "+email+" or "+"password";
			mv.addObject("message",message);
			mv.setViewName("Login.jsp");
			return mv;
		}
	
	}	
	
}
