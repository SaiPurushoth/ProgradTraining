package com.moviedom.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.moviedom.app.model.Theaters;

public interface TheatersRepository extends CrudRepository<Theaters,Integer>{
	Theaters findByEmailAndPassword(String email,String Password);

}
