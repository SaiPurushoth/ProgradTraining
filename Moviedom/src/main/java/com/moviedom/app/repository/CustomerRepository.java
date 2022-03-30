package com.moviedom.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.moviedom.app.model.Customers;


public interface CustomerRepository extends CrudRepository<Customers,Integer> {

	Customers findByEmailAndPassword(String email,String Password);
}
