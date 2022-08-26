package com.spring.dep;

public class User implements Userinterface {
	
	
	private Personinterface person;
	
	private String email;
	private String team;
	
	
	

	@Override
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

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
	
	
	
	
	public void doStart() {
		System.out.println("Start");
		
		
	}
	
	public void doEnd() {
		System.out.println("End");
		
	}

}
