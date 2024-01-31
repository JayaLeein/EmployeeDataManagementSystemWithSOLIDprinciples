/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import java.io.IOException;


/**
 * Interface for persistence service to save employee data using a formatter
 * @author JingYi Li
 */
public interface PersistenceService {
    
    void saveEmployee(Employee employee, String filename, Formatter formatter) throws IOException;
    
}
