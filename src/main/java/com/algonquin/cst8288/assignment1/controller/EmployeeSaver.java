/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * For saving data to write data into file but it violates DIP
 * @author jayalee
 */
public class EmployeeSaver {
    
	public void saveEmployee(Employee person, String filename, Formatter formatter) throws IOException { 

		try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
			writer.println(formatter.format(person));
			writer.flush();
		}
    }
    
}
