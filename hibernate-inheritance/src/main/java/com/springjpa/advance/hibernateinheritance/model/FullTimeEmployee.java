package com.springjpa.advance.hibernateinheritance.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee {

	private BigDecimal salary;

	public FullTimeEmployee() { }

	public FullTimeEmployee(String name ,BigDecimal salary) {
		super(name);
		this.setSalary(salary);
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}
