import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Date;

/**
 * JUnit tests to verify the functionalities of the ContractEmployeeImpl class
 * @author jayalee
 */
public class ContractEmployeeImplTest {

    @Test
    public void testCalculateTotalCompensation() {
        ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl();
        contractEmployee.setSalary(50000.0);

        double expectedTotalCompensation = 50000.0;
        double actualTotalCompensation = contractEmployee.calculateTotalCompensation(contractEmployee);

        assertEquals(expectedTotalCompensation, actualTotalCompensation, 0.001);
    }

    @Test
    public void testSetAndGetRenewalDate() {
        ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl();
        Date renewalDate = new Date();

        contractEmployee.setRenewalDate(renewalDate);

        assertEquals(renewalDate, contractEmployee.getRenewalDate());
    }

    @Test
    public void testToString() {
        ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl();
        contractEmployee.setName("John Doe");
        contractEmployee.setEmail("john.doe@example.com");
        contractEmployee.setAddress("123 Main St");
        contractEmployee.setSalary(60000.0);
        contractEmployee.setNumberOfServiceYear(3);

        Date renewalDate = new Date();
        contractEmployee.setRenewalDate(renewalDate);

        String expectedToString = "Employee [name=John Doe, email=john.doe@example.com, address=123 Main St, salary=60000.0, numberOfServiceYear=3, renewalDate= " + renewalDate + "]";
        String actualToString = contractEmployee.toString();

        assertEquals(expectedToString, actualToString);
    }
}
