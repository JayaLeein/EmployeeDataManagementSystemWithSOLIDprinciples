
import com.algonquin.cst8288.assignment1.controller.EmployeeController;
import com.algonquin.cst8288.assignment1.controller.EmployeeSaver;
import com.algonquin.cst8288.assignment1.controller.EmployeeValidator;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;

public class PersistenceServiceTest {

	@Test
	public void testSaveEmployee() throws IOException {
	PermanentEmployeeImpl permEmployee = new PermanentEmployeeImpl();
        permEmployee.setName("Andres");
        permEmployee.setEmail("123@123.com");
        permEmployee.setAddress("123 baseline");
        permEmployee.setSalary(3000);
        permEmployee.setNumberOfServiceYear(5);
        permEmployee.setTotalCompensation(permEmployee.calculateTotalCompensation(permEmployee));
        permEmployee.setBonus(permEmployee.calculateBonus(permEmployee));
        permEmployee.calculateTotalCompensation(permEmployee);
        EmployeeValidator employeeValidator = new EmployeeValidator();
        EmployeeSaver employeeSaver = new EmployeeSaver();
        EmployeeController employeeController = new EmployeeController(employeeValidator, employeeSaver);
        
    
        
        JSONFormatter formatter = new JSONFormatter(); //Creation of and instance of the format JSON
        String testEmployee = employeeController.processEmployee(permEmployee); // Save employee in document
         Assert.assertEquals("SUCCESS", testEmployee);
	}

}