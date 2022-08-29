package com.spring.ann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		 retrieve bean from spring container

		MasterInterface ms =context.getBean("master",MasterInterface.class);
		// call methods on the bean

		ms.callMysport();
		
		// close the context
		context.close();

	}

}
