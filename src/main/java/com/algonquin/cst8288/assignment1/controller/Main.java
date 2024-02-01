package com.algonquin.cst8288.assignment1.controller;


import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;
import java.io.IOException;

/**
 * Main class to execute the application
 * @author JingYi Li
 */

public class Main {
	
	
    public static void main(String[] args) throws IOException {
        // Instantiate two Employee objects
        PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl();
        permanentEmployee.setName("JohnDoe");
        permanentEmployee.setEmail("john.doe@example.com");
        permanentEmployee.setAddress("123 Main St");
        permanentEmployee.setSalary(60000.0);
        permanentEmployee.setNumberOfServiceYear(5);

        ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl();
        contractEmployee.setName("JaneSmith");
        contractEmployee.setEmail("jane.smith@example.com");
        contractEmployee.setAddress("456 Oak St");
        contractEmployee.setSalary(50000.0);
        contractEmployee.setNumberOfServiceYear(3);

        // Use EmployeeController to save both objects in JSON and Text formats
        EmployeeController employeeController = new EmployeeController(new EmployeeValidator(), new EmployeeSaver());

        // Save data to files
        employeeController.processEmployee(permanentEmployee);
        employeeController.processEmployee(contractEmployee);

        // Output data to the Console
        System.out.println("Permanent Employee Data (JSON Format):");
        System.out.println(employeeController.processEmployee(permanentEmployee));

        System.out.println("\nContract Employee Data (Text Format):");
        System.out.println(employeeController.processEmployee(contractEmployee));

        // Alternatively, you can use the formatters directly
        System.out.println("\nFormatted Permanent Employee Data (JSON Format):");
        System.out.println(new JSONFormatter().format(permanentEmployee));

        System.out.println("\nFormatted Contract Employee Data (Text Format):");
        System.out.println(new TextFormatter().format(contractEmployee));
    }

}
