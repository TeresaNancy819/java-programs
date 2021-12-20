package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Books {

	 int id,price;
	 String publisher;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	
	}
	void display1() {
		System.out.println("Publisher: "+publisher);
		System.out.println("ID: "+id);
		System.out.println("Price: "+price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("Bookss.xml");
	        Books b=(Books)context.getBean("s2");
	        b.display1();

	
	
	}
	
	
	
	 
}
