package com.spring.ann;

import org.springframework.stereotype.Component;

@Component("tennis")
public class TennisSport implements Sportinterface {
	
	@Override
	public void mySport() {
		
		System.out.println("i am tennis");
	}

}
