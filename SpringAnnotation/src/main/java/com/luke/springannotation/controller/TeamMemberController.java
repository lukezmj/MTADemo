package com.luke.springannotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.luke.springannotation.model.TeamMember;

@Controller
public class TeamMemberController {
	@RequestMapping(value="/teammember", method=RequestMethod.GET)
	public ModelAndView teammember() {
		return new ModelAndView("teammember", "command", new TeamMember());
		
	}
	
	@RequestMapping(value="/addmember", method=RequestMethod.POST)
	public String addmember(@ModelAttribute("SpringWeb") TeamMember member, ModelMap model) {
		model.addAttribute("id", member.getId());
		model.addAttribute("name", member.getName());
		model.addAttribute("age", member.getAge());
		
		return "result";
	}

}
