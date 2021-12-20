package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
	String name,address;
	int id,salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
      void displayEmployee() {
    	  System.out.println("Name: "+name);
    	  System.out.println("address: "+address);
    	  System.out.println("id: "+id);
    	  System. out.println("salary "+salary);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("Bookss.xml");
	        Employee e=(Employee)context.getBean("s3");
	        e.displayEmployee();
	}

}
