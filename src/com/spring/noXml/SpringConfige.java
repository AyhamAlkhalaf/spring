package com.spring.noXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.noXml")
public class SpringConfige {
	
	
	@Bean
	public MasterInterface myMaster() {
		Master  ms=new Master(mySport());
		return ms ;
		
	}
	
	@Bean
	public SportInsterface mySport() {
		return new Sport();
		
	}

}
