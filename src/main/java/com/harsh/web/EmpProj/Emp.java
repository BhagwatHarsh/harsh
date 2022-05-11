package com.harsh.web.EmpProj;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name="Employee")
public class Emp {
	@Id
private int empId;
	@Column(name="Employee_Name")
private String name;
	@ManyToMany(mappedBy="em", cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private List<Project>prj;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Project> getPrj() {
		return prj;
	}
	public void setPrj(List<Project> prj) {
		this.prj = prj;
	}
	public Emp(int empId, String name, List<Project> prj) {
		super();
		this.empId = empId;
		this.name = name;
		this.prj = prj;
	}
	public Emp() {
		super();
	
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", prj=" + prj + "]";
	}
	

}
