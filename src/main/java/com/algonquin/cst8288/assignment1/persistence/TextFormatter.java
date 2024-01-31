/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.persistence;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import java.io.IOException;

/**
 *
 * @author jayalee
 */

public class TextFormatter implements Formatter {

//    @Override
//    public String format(Employee employee) throws IOException {
//        return "";
//    }
    
    @Override
    public String format(Employee employee) throws IOException {
        if (employee == null) {
            throw new IllegalArgumentException("Employee object cannot be null");
        }

        StringBuilder formattedText = new StringBuilder();
        formattedText.append("name=").append(employee.getName()).append(", ");
        formattedText.append("email=").append(employee.getEmail()).append(", ");
        formattedText.append("address=").append(employee.getAddress()).append(", ");
        formattedText.append("salary=").append(employee.getSalary()).append(", ");
        formattedText.append("numberOfServiceYear=").append(employee.getNumberOfServiceYear());

        return formattedText.toString();
    }
    
}
