package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test1 {
	
	public static void main(String [] srgs )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student=(Student)context.getBean("studentbean");
		student.displayInfo();
	}
}

