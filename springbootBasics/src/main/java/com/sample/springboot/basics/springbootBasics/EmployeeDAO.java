package com.sample.springboot.basics.springbootBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String saveEmployee(Employee employee) {

		int rowsAffected = jdbcTemplate.update("insert into employee values(?,?,?,?)",
				new Object[] { employee.getId(), employee.getEmpName(), employee.getEmpDept(), employee.getSal() });

		if (rowsAffected > 0) {
			return "Employee details saved successfully!!!";
		} else {
			return "Problem in ssaving employee!!!!";
		}

	}

}
