package com.sample.springboot.basics.springbootBasics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Employee {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + id + ", empName=" + empName + ", empDept=" + empDept + ", sal=" + sal + "]";
	}
	private String id;
	private String empName;
	private String empDept;
	private String sal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param empId the empId to set
	 */
	
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the sal
	 */
	public String getSal() {
		return sal;
	}

	/**
	 * @param sal the sal to set
	 */
	public void setSal(String sal) {
		this.sal = sal;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empDept
	 */
	public String getEmpDept() {
		return empDept;
	}
	/**
	 * @param empDept the empDept to set
	 */
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	/**
	 * @return the salary
	 */
	public String getSalary() {
		return sal;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.sal = salary;
	}
	
	
	
	

}
