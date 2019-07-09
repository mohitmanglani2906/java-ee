package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Here we have used this class to make a table in database
 * */

@Entity       // It simply creates a Table for you
public class Alien 
{
	@Id        // It Creates a primary key 
	private int aid;
	private String aname;
	private String tech;
	
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}

		
}
