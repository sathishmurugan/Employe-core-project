package com.sathish.employe.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sathish.employe.model.Employe;
import com.sathish.employe.util.ConnectionUtil;

public class EmployeDAO {

	JdbcTemplate jdbcTemplate=ConnectionUtil.jdbcTemplate();
	public void insert(Employe employe)
	{
		String sql="insert into emp33(id,name)values(?,?)";
		Object[]params={employe.getId(),employe.getName()};
		int row=jdbcTemplate.update(sql,params);
		System.out.println(row + " Employe Added" );
	}
}
