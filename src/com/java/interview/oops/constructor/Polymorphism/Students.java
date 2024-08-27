package com.java.interview.oops.constructor.Polymorphism;

public class Students {

	private int id;
	private String name;
	private String department;
	private int cgpa;
	
	public Students(int id, String name, String department, int cgpa) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.cgpa = cgpa;
	}

	public int getCgpa() {
		return cgpa;
	}

	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", department=" + department + ", cgpa=" + cgpa + "]";
	}
}
