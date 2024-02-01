/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * ContractEmployeeImpl for implementing contract employee's information
 * @author JingYi Li
 */
public class ContractEmployeeImpl extends Employee implements EmployeeService {
    
    	private Date renewalDate;
        
        public Date getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
    
    @Override
    public double calculateTotalCompensation(Employee employee) {
        return getSalary();
    }
    
    @Override
    public String toString() {
	return "Employee [name=" + getName() + ", email=" + getEmail() + ", address=" + getAddress() + ", salary=" + getSalary()
			+ ", numberOfServiceYear=" + getNumberOfServiceYear() + ", renewalDate= " + renewalDate + "]";
    }
}
