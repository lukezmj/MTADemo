package com.luke.springxml;

public class TeamMember {
	
	private String id;
	private String name;
	private String age;
	private Lunch lunch;
	
	public TeamMember() {
	}
	
	public TeamMember(Lunch lunch) {
		this.lunch = lunch;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public void init() {
		System.out.println( "Name is: ");
	}
	
	public void destroy() {
		System.out.println(".");
	}
	
	public String pickVender() {
		return lunch.getVender();
	}
}
