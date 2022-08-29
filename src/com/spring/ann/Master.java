package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface{
	
	
	@Autowired
	@Qualifier("student")
	private CompanyInerface ci;
	
	


	/*
	@Autowired
	private Sportinterface sportinterface;
	*/
	
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
		
		ci.Start();

	}
	
	

	@Override
	public void callMysport() {
		
	}
	

}
