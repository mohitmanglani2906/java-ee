package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class Laptop 
{
	private int price;
	private String brand;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public void compile()
	{
		System.out.println("Compling.....");
	}
	
}
