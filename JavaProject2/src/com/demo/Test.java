package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student s=(Student)context.getBean("s1");
        s.display();
	}

}
