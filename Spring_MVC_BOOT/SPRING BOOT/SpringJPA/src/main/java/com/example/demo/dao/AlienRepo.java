package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>
{
	
	List<Alien> findByTech(String tech);
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);
	
	
	/*
	 * Here we have to make an interface that just extends CrudRepository 
	 * Here we have to pass a class of which we want to make a table in database and id that is
	 * primary key
	 * */
}
