package com.luke.springannotation.dao;

import java.util.List;

import com.luke.springannotation.model.TeamMember;

public interface TeamMemberDAO {
	public List<TeamMember> listTeamMembers();
	public void create(String id, String name, Integer age);
	public TeamMember getMember(String id);
}
