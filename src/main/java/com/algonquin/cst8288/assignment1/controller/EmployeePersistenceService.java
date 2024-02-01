/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import java.io.IOException;

/**
 * Implementation of PersistenceService for saving employee data.
 * @author JingYi Li
 */
public class EmployeePersistenceService implements PersistenceService {
    
    private final EmployeeSaver employeeSaver;

    public EmployeePersistenceService(EmployeeSaver employeeSaver) {
        this.employeeSaver = employeeSaver;
    }

    @Override
    public void saveEmployee(Employee employee, String filename, Formatter formatter) throws IOException {
        employeeSaver.saveEmployee(employee, filename, formatter);
    }
}
