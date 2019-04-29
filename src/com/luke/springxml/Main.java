package com.luke.springxml;

//import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luke.springxml.TeamMember;

public class Main {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("Bean.xml");
		context.registerShutdownHook();
		
		TeamMember member1 = (TeamMember) context.getBean("member1");
		System.out.println(member1.getName());
		
		//scope: singleton
		member1 = (TeamMember) context.getBean("member1");
		System.out.println(member1.getName());
		
		//((DefaultListableBeanFactory) context.getBeanFactory()).destroySingleton("member1");
		
		TeamMember member2 = (TeamMember) context.getBean("member2");
		member2.setName("Lizzy");
		System.out.println(member2.getName());
		
		//scope: prototype
		member2 = (TeamMember) context.getBean("member2");
		System.out.println(member2.getName());
		
		//DI
		TeamMember member3 = (TeamMember) context.getBean("member3");
		System.out.println(member3.getName()+" will have "+member3.pickVender()+" for lunch.");
		
		//autowire
		TeamMember member4 = (TeamMember) context.getBean("member4");
		System.out.println(member4.getName()+" will have "+member4.pickVender()+" for lunch.");		
	}
}
