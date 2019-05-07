package com.luke.springannotation.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.luke.springannotation.dao.TeamMemberDAOImpl;

@Configuration
@Import(TeamMemberConfig.class)
public class DatabaseConfig{
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/team");
		ds.setUsername("root");
		ds.setPassword("Root123");
		return ds;
	}	 
	
	@Bean
	public TeamMemberDAOImpl teamMemberDAOImpl(){
		return new TeamMemberDAOImpl(dataSource());
	}
}