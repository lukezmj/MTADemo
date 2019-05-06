package com.luke.springannotation.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.luke.springannotation.model.TeamMember;

public class TeamMemberMapper implements RowMapper<TeamMember>{

	@Override
	public TeamMember mapRow(ResultSet rs, int rowNum) throws SQLException {
		TeamMember member = new TeamMember();
		member.setId(rs.getString("id"));
		member.setName(rs.getString("name"));
		member.setAge(rs.getInt("age"));
		return member;
	}

}
