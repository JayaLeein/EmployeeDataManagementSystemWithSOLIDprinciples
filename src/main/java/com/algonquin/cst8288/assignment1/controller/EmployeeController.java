package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;

/**
 * 
 * EmployeeController class responsible for processing employee data.
 * Process, validate and save employee data.
 * @author JingYi Li
 * 
 */

public class EmployeeController {
            
    private final EmployeeValidator employeeValidator;
    private final EmployeeSaver employeeSaver;
//    private Formatter formatter;
    JSONFormatter jsonFormatter = new JSONFormatter();
    TextFormatter textFormatter = new TextFormatter();
   

    public EmployeeController(EmployeeValidator employeeValidator, EmployeeSaver employeeSaver) {
        this.employeeValidator = employeeValidator;
        this.employeeSaver = employeeSaver;
    }

    public String processEmployee(Employee employee) throws IOException {
        if (!employeeValidator.isValidEmployee(employee)) {
            return "FAILED";
        }
        
        this.employeeSaver.saveEmployee(employee, "json_employee_data.txt", jsonFormatter);
        this.employeeSaver.saveEmployee(employee, "text_employee_data.txt", textFormatter);
        
        return "SUCCESS";
    }
}
