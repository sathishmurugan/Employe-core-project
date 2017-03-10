package com.sathish.employe.util;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	public static BasicDataSource basicDataSource()
	{
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://139.59.29.57:3306/vels_db");
		ds.setUsername("vels_user");
		ds.setPassword("Vels_pass_123$");
		return ds;	
	}
	public static JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(basicDataSource());
		return jdbcTemplate;
		
	}
	

}
