package com.luke.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.luke.springannotation.Controller.TeamMemberController;
import com.luke.springannotation.model.TeamMember;

public class Main {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(TeamMemberController.class);

		TeamMember member1 = (TeamMember) context.getBean("member1");
		System.out.println(member1.getName());
		
		//bean dependency injection
		TeamMember member2 = (TeamMember) context.getBean("member2");
		System.out.println(member2.getName()+" will have "+member2.pickVender()+" for lunch.");

		context.registerShutdownHook();
		
		context.close();
	}
}
