package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * 
 * EmployeeService interface
 * 
 */

//

public interface EmployeeService {

	public double calculateTotalCompensation(Employee employee);
	//bonus + salary. so this is not for every emloyee
        //depends on you, if you want to seperate or not
        
	public double pensionContribution(Employee employee);
	
	public double calculateBonus(Employee employee);
        //fot contract
	
	public Date renewalDate();
        
        
        //to seperate interfaces
        //create a interface for permanent and one for contract
	
}
