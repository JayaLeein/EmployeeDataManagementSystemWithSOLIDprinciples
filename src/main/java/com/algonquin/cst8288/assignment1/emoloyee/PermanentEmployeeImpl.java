/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import com.algonquin.cst8288.assignment1.controller.Rate;

/**
 *
 * @author jayalee
 */
public class PermanentEmployeeImpl extends Employee implements EmployeeService, PermanentEmployeeService {
    
    	private double bonus;
	private double totalCompensation;
        
        public double getBonus() {
                return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getTotalCompensation() {
		return totalCompensation;
	}

	public void setTotalCompensation(double totalCompensation) {
		this.totalCompensation = totalCompensation;
	}

    @Override
    public double calculateTotalCompensation(Employee employee) {
        setBonus(employee.getSalary() * Rate.BONUS_PERCENTAGE * getNumberOfServiceYear());
        return getSalary() + getBonus();
    }

    @Override
    public double pensionContribution(Employee employee) {
        return employee.getSalary() * Rate.PENSION_PERCENTAGE;
    }

    @Override
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * Rate.BONUS_PERCENTAGE * employee.getNumberOfServiceYear();
    }
    
    @Override
    public String toString() {
	return "Employee [name=" + getName() + ", email=" + getEmail() + ", address=" + getAddress() + ", salary=" + getSalary()
			+ ", numberOfServiceYear=" + getNumberOfServiceYear() + ", bonus=" + bonus + ", totalCompensation="
			+ totalCompensation + "]";
    }
}
