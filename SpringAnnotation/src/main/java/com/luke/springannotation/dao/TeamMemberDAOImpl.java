package com.luke.springannotation.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.luke.springannotation.model.TeamMember;

public class TeamMemberDAOImpl implements TeamMemberDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public TeamMemberDAOImpl() {
	}

	public TeamMemberDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public List<TeamMember> listTeamMembers() {
		String sql = "select * from teammember";
		List<TeamMember> memberList = new ArrayList<TeamMember>();
		// Connection conn = null;
		// ResultSet rs = null;
		// Statement stat = null;
		// try {
		// conn = dataSource.getConnection();
		// stat = conn.createStatement();
		// rs = stat.executeQuery(sql);
		// while (rs.next()) {
		// TeamMember member = new TeamMember();
		// member.setId(rs.getString("id"));
		// member.setName(rs.getString("name"));
		// member.setAge(rs.getInt("age"));
		// memberList.add(member);
		// }
		// } catch (SQLException e) {
		// e.printStackTrace();
		// } finally {
		// try {
		// rs.close();
		// stat.close();
		// conn.close();
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// }
		//
		memberList = jdbcTemplateObject.query(sql, new TeamMemberMapper());

		return memberList;
	}

	@Override
	public void create(String id, String name, Integer age) {
		String sql = "insert into teammember (id, name, age) values(?, ?, ?)";
//		Connection conn = null;
//		PreparedStatement stat = null;
//		try {
//			conn = dataSource.getConnection();
//			stat = conn.prepareStatement(sql);
//			stat.setString(1, id);
//			stat.setString(2, name);
//			stat.setInt(3, age);
//			int rc = stat.executeUpdate();
//			if (rc == 0) {
//				System.out.println("Member save failed with id = " + id);
//			} else
//				System.out.println("Member saved with id= " + id);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				stat.close();
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
		jdbcTemplateObject.update(sql, id, name, age);
	}

	@Override
	public TeamMember getMember(String id) {
		String sql = "select * from teammember where id = ?";
//		Connection conn = null;
//		PreparedStatement stat = null;
//		ResultSet rs = null;
//		TeamMember member = null;
//		try {
//			conn = dataSource.getConnection();
//			stat = conn.prepareStatement(sql);
//			stat.setString(1, id);
//			rs = stat.executeQuery();
//			if (rs.next()) {
//				member = new TeamMember();
//				member.setId(rs.getString("id"));
//				member.setName(rs.getString("name"));
//				member.setAge(rs.getInt("age"));
//				System.out.println("Member found with id = " + id);
//			} else
//				System.out.println("Member not found");
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} finally {
//			try {
//				rs.close();
//				stat.close();
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}

		
		TeamMember member = jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new TeamMemberMapper());

		return member;
	}

}
