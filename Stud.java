package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="stud")

public class Stud {
	@Id
	
	@Column(name="id")
	private int id;
	
	@Column(name="studentName")
	private String studentName;
	
	@Column(name="departmentName")
	private String departmmentName;
	
	@Column(name="mailid")
	private String mailid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartmmentName() {
		return departmmentName;
	}

	public void setDepartmmentName(String departmmentName) {
		this.departmmentName = departmmentName;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	

	public Stud() {
	}

	public Stud(int id, String studentName, String departmmentName, String mailid) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.departmmentName = departmmentName;
		this.mailid = mailid;
	}
	
	
	

}
