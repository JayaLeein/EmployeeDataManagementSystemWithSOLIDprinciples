/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

/**
 * PermanentEmployeeService interface for calculating bonus and pension contribution
 * @author JingYi Li
 */
public interface PermanentEmployeeService  {
    	public double pensionContribution(Employee employee);
	public double calculateBonus(Employee employee);
}
