package com.sathish.employe.dao;

import com.sathish.employe.model.Employe;

public class TestEmployeDAO {

	public static void main(String[] args) {
		Employe	 employe = new Employe();
		EmployeDAO dao = new EmployeDAO();
		employe.setId("102");
		employe.setName("ramkumar");
		dao.insert(employe);
		
	}

}
