package com.spring.noXml;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfige.class);


//		MasterInterface  ms=context.getBean("myMaster",MasterInterface.class);
		Manger  mn =context.getBean("manger",Manger.class);
		
		System.out.println(mn.getEmail());
		System.out.println(mn.getTeam());

//		ms.name();
//		ms.getSport();

		context.close();


	}

}
