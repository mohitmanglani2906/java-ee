package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component   				// This says Make this class component of a com.example.demo so that we can create a object of that class
@Scope(value="prototype")   // This makes Spring prototype design pattern that means it does not create an object until you dnt say
public class Student
{
	private int sid;
	private String sname;
	private String stech;
	
	@Autowired
	private Laptop laptop;
	
	public Student()
	{
		super();
		System.out.println("Object Created");
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStech() {
		return stech;
	}
	public void setStech(String stech) {
		this.stech = stech;
	}
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void show()
	{
		System.out.println("Hello Show");
	}
	
	public void call()
	{
		laptop.compile();
	}
	
}
