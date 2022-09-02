package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Admin implements PersonInterface {
	@PostConstruct
	public void init() {
		
		System.out.println("connected with DP");
		
	}
	
	

	@Override
	public void Name() {
		// TODO Auto-generated method stub
		
		System.out.println("i am admin");
		
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("not connected with DP");
		
	}
	
	
	
	
	
	
	
	

}
