package com.example.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.app.models.DAOUser;

public interface UserDao extends CrudRepository<DAOUser, Integer>{
	DAOUser findByUsername(String username);

}
