package com.example.Imran.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empid;
	
	@Column(name ="empname")
	private String empname;
	
	@Column(name ="empage")
	private int empage;
	
	@Column(name ="empcity")
	private String empcity;

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public String getEmpcity() {
		return empcity;
	}

	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}

	public Employee(Long empid, String empname, int empage, String empcity) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empage = empage;
		this.empcity = empcity;
	}
	
	
	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empage=" + empage + ", empcity=" + empcity
				+ "]";
	}


	
	

}
