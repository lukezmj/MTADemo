package com.luke.springannotation;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.luke.springannotation.config.DatabaseConfig;
import com.luke.springannotation.dao.TeamMemberDAOImpl;
import com.luke.springannotation.model.TeamMember;

public class Main {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);

		TeamMember member1 = (TeamMember) context.getBean("member1");
		System.out.println(member1.getName());

		// bean dependency injection
		TeamMember member2 = (TeamMember) context.getBean("member2");
		System.out.println(member2.getName() + " will have" + member2.pickVender() + " for lunch.");

		TeamMemberDAOImpl teamMemberDAOImpl = (TeamMemberDAOImpl) context.getBean(TeamMemberDAOImpl.class);

		List<TeamMember> members = teamMemberDAOImpl.listTeamMembers();
		for (TeamMember record : members) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println(", Age : " + record.getAge());
		}

		// teamMemberDAOImpl.create("i076602", "Lizzy", 18);

		TeamMember member = teamMemberDAOImpl.getMember("i301305");
		System.out.print("ID : " + member.getId());
		System.out.print(", Name : " + member.getName());
		System.out.println(", Age : " + member.getAge());

		context.registerShutdownHook();

		context.close();
	}
}
