package com.spring.dep;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * java 
		 * 
		person person =new person();
		User user = new User();
		user.setPerson(person);
		user.getPerson();
		*/
		/*
		User user= new User();
		user.setEmail("ayham.ayham909@gmail.com");
		user.setTeam("ICBC" );
		System.out.println(user.getEmail());
		System.out.println(user.getTeam());
		*/
		
		
//       spring		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
//		// retrieve bean from spring container
		Userinterface user = context.getBean("user",Userinterface.class);
//		Userinterface user1 = context.getBean("user",Userinterface.class);
//		Userinterface user2 = context.getBean("user",Userinterface.class);
		// call methods on the bean
//		System.out.println(user1 == user2);
//		System.out.println(user1.getEmail() + "  " + user1.getTeam());
//		System.out.println(user2.getEmail() + "  " + user2.getTeam());
		System.out.println(user.getEmail() + "  " + user.getTeam());
//		// retrieve bean from spring container
//		Personinterface person = context.getBean("person",Personinterface.class);
//		// call methods on the bean
//		person.bigen();
		
		
		// close the context
		context.close();
	

	}

}
