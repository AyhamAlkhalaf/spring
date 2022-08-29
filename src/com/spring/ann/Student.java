package com.spring.ann;

import org.springframework.stereotype.Component;

@Component
public class Student  implements CompanyInerface {
	
	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("i am Student");
	}

}
