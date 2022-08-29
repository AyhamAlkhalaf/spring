package com.spring.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Admin implements PersonInterface {

	@Override
	public void Name() {
		// TODO Auto-generated method stub
		
		System.out.println("i am admin");
		
	}
	
	
	
	
	

}
