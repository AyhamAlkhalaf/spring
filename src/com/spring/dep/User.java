package com.spring.dep;

public class User implements Userinterface {
	
	
	private Personinterface person;

	
	public void setPerson(Personinterface person) {
		
		this.person = person; 
		
	}
	
	@Override
	public void getPerson(){
		this.person.bigen();
		
		
	}
	
	
	
	
	@Override
	public void start() {
		
		System.out.println("i am user");
		
	}

}
