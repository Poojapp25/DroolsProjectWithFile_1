package com.project.DroolsPracticeProject.Entity;


public class Employee {

	private int emp_id;
	private String emp_name;
	private String emp_BU;
	private int office_floor=-1;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_BU() {
		return emp_BU;
	}
	public void setEmp_BU(String emp_BU) {
		this.emp_BU = emp_BU;
	}
	public int getOffice_floor() {
		return office_floor;
	}
	public void setOffice_floor(int office_floor) {
		this.office_floor = office_floor;
	}
}
