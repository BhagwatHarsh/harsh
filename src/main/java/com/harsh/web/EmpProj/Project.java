package com.harsh.web.EmpProj;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Project_table")
public class Project {
	@Id
	@Column(name="Project_Id")
private int id;
	@Column(name="Project_Name")
private String name;
	@ManyToMany
private List<Emp>em;
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
	public List<Emp> getEmp() {
		return em;
	}
	public void setEmp(List<Emp> emp) {
		this.em = emp;
	}
	public Project(int id, String name, List<Emp> emp) {
		super();
		this.id = id;
		this.name = name;
		this.em = em;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", emp=" + em + "]";
	}

	
}
