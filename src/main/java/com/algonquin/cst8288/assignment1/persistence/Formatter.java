package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;

/**
 * Interface to format employee data in the desired format
 * @author JingYi Li
 */
public interface Formatter {
	
	public String format(Employee employee) throws IOException;
	
}

