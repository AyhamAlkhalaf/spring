package com.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ann.MasterInterface;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		 retrieve bean from spring container

		PersonInterface  admin1=context.getBean("admin",PersonInterface.class);
		
		
		// call methods on the bean
		admin1.Name();
		
		
		
		
		// close the context
		context.close();

	}

}
