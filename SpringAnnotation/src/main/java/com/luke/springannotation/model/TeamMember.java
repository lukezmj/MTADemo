package com.luke.springannotation.model;

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
		System.out.println( "Bean "+this.name+" initialized." );
	}
	
	public void destroy() {
		System.out.println("Bean "+this.name+" is destroyed.");
	}
	
	public String pickVender() {
		return getLunch().getVender();
	}

	public Lunch getLunch() {
		return lunch;
	}

	public void setLunch(Lunch lunch) {
		this.lunch = lunch;
	}
}
