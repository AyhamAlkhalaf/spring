package com.spring.noXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Master implements MasterInterface{




	//	@Autowired
	//	@Qualifier("football")
	private SportInsterface  sp;
   
	
	

	public Master(SportInsterface sp) {

		this.sp = sp;
	}


	@Override
	public void name() {
		// TODO Auto-generated method stub

		System.out.println("i am master ");

	}


	@Override
	public void getSport() {
		// TODO Auto-generated method stub

		sp.MySport();

	}

}


