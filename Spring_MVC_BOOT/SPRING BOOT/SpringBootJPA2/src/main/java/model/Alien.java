package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Here we have used this class to make a table in database
 * */

@Entity       // It simply creates a Table for you
public class Alien implements Serializable
{
	@Id        // It Creates a primary key 
	private int aid;
	private String aname;
	
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
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	
	
	
	
	
}
