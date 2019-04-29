package com.luke.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luke.springxml.TeamMember;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Bean.xml");
		
		TeamMember member1 = (TeamMember) context.getBean("member1");
		TeamMember member2 = (TeamMember) context.getBean("member2");
		
		System.out.println(member1.getName());
		System.out.println(member2.getName());
		
	}
}
