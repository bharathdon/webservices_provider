package com.epam;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private Integer eno;
	private String name;
	private Double salary;
	
	
	public Employee(int i, String string, double d) {
		super();
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
