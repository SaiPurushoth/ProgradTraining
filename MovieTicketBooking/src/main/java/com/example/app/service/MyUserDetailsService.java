package com.example.app.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.app.models.DAOUser;
import com.example.app.models.UserDTO;
import com.example.app.repository.UserDao;



@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		DAOUser user =  userDao.findByUsername(username);
		if (user == null) {
			System.out.println("");
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}

	
	public DAOUser save(UserDTO user) {
		DAOUser newUser = new DAOUser();
		newUser.setName(user.getName());
		newUser.setAge(user.getAge());
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setPhone(user.getPhone());
		 return userDao.save(newUser);
	}
	

}
