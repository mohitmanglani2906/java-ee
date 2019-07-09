package com.mohit.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Declare a method that will find a user by its username and extend a class
// JpaRepository
public interface UserRepository extends JpaRepository<User, Long> 
{
	User findByUsername(String username);
}
