package com.luke.springannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luke.springannotation.model.TeamMember;

public class Main {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		TeamMember member1 = (TeamMember) context.getBean("member1");
		System.out.println(member1.getName());

		TeamMember member2 = (TeamMember) context.getBean("member2");
		member2.setName("Lizzy");
		System.out.println(member2.getName());

		// scope: prototype
		member2 = (TeamMember) context.getBean("member2");
		System.out.println(member2.getName());

		// DI
		TeamMember member3 = (TeamMember) context.getBean("member3");
		System.out.println(member3.getName() + " will have " + member3.pickVender() + " for lunch.");

		// autowire
		TeamMember member4 = (TeamMember) context.getBean("member4");
		System.out.println(member4.getName() + " will have " + member4.pickVender() + " for lunch.");

		// autowire byName
		TeamMember member5 = (TeamMember) context.getBean("member5");
		System.out.println(member5.pickVender());

		context.registerShutdownHook();
		
		context.close();
	}
}
