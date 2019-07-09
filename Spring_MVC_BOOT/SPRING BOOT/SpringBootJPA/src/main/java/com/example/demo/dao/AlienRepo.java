package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{
	/*
	 * Here we have to make an interface that just extends CrudRepository 
	 * Here we have to pass a class of which we want to make a table in database and id that is
	 * primary key
	 * */
}
