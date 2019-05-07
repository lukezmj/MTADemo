package com.luke.springannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.luke.springannotation.model.Lunch;
import com.luke.springannotation.model.TeamMember;

@Configuration
public class TeamMemberConfig{
	@Bean(initMethod="init", destroyMethod="destroy")
	@Scope("singleton")
	public TeamMember member1() {
		TeamMember member = new TeamMember();
		member.setName("Luke");
		return member;
	}
	
	@Bean(initMethod="init", destroyMethod="destroy")
	@Scope("singleton")
	public TeamMember member2() {
		TeamMember member = new TeamMember(wangui());
		member.setName("Lizzy");
		return member;
	}
	
	@Bean
	public Lunch wangui() {
		Lunch wangui = new Lunch();
		wangui.setVender("Wangui");
		return wangui;
	}
	
}
