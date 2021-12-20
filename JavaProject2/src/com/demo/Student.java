package com.demo;

public class Student {
	String name,rollno;

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
	}

}
