package com.algonquin.cst8288.assignment1.emoloyee;

/**
 * A Plain Old Java Object (POJO) containing attributes related to employees
 * @author JingYi Li
 */
public class Employee {
        
	private String name;
	private String email;
	private String address;
	private double salary;
	private int numberOfServiceYear;

	public Employee() {
		// Default constructor
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNumberOfServiceYear() {
		return numberOfServiceYear;
	}

	public void setNumberOfServiceYear(int numberOfServiceYear) {
		this.numberOfServiceYear = numberOfServiceYear;
	}

}