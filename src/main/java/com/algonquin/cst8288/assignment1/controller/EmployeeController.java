package com.algonquin.cst8288.assignment1.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;

/**
 * 
 * The controller class responsible for processing employee data.
 * Process, validate and save employee data.
 * @author JingYi Li
 * 
 */

public class EmployeeController {
            
    private final EmployeeValidator employeeValidator;
    private final EmployeeSaver employeeSaver;
    private Formatter formatter;

    public EmployeeController(EmployeeValidator employeeValidator, EmployeeSaver employeeSaver) {
        this.employeeValidator = employeeValidator;
        this.employeeSaver = employeeSaver;
    }

    public String processEmployee(Employee employee) throws IOException {
        if (!employeeValidator.isValidEmployee(employee)) {
            return "FAILED";
        }
        
        this.employeeSaver.saveEmployee(employee, "employee_data.txt", formatter);
        
        return "SUCCESS";
    }
}
