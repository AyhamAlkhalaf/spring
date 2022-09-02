package com.spring.noXml;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfige.class);


		MasterInterface  ms=context.getBean("master",MasterInterface.class);
//		SportInsterface  sp=context.getBean("sport",SportInsterface.class);

		ms.name();
//		sp.MySport();
		ms.getSport();

		context.close();


	}

}
