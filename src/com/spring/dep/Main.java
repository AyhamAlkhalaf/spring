package com.spring.dep;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		person person =new person();
//		User user = new User(person);
//		user.getPerson();
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Userinterface user = context.getBean("user",Userinterface.class);
		// call methods on the bean
		user.start();
//		// retrieve bean from spring container
//		Personinterface person = context.getBean("person",Personinterface.class);
//		// call methods on the bean
//		person.bigen();
		
		
		// close the context
		context.close();
	

	}

}
