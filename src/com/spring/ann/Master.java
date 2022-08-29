package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface{
    
	@Autowired
	private Sportinterface sportinterface;
	
	
	/*
	@Autowired
	public Master(Sportinterface sportinterface) {
		this.sportinterface = sportinterface;
			
	}
	*/
	
	
	/*
	@Autowired
	public void setSportinterface(Sportinterface sportinterface) {
		this.sportinterface = sportinterface;
	}
	*/
	
	
	@Override
	public void name() {
		System.out.println("i am Master");

	}
	
	

	@Override
	public void callMysport() {
		sportinterface.mySport();
		
	}
	

}
