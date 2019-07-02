package com.opentext.Employee.dto;

 
	import java.io.Serializable;
    import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(name="employee_info")
	public class StudentInformation implements Serializable 
	{
		/**
		 * 
		 */
	@Id
	@Column(name="Eid")
	private int Eid;
	@Column(name="Ename")
	private String Ename;
	@Column(name="Designation")
	private String Designation;
	@Column(name="Salary")
    private int Salary;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
    
	}
		
