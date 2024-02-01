import com.algonquin.cst8288.assignment1.controller.Rate;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import static org.junit.Assert.*;
import org.junit.Test;

public class PermanentEmployeeImplTest {

    @Test
    public void testCalculateTotalCompensation() {
        PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl();
        permanentEmployee.setSalary(70000.0);
        permanentEmployee.setNumberOfServiceYear(5);

        double expectedBonus = 70000.0 * Rate.BONUS_PERCENTAGE * 5;
        double expectedTotalCompensation = 70000.0 + expectedBonus;

        double actualTotalCompensation = permanentEmployee.calculateTotalCompensation(permanentEmployee);

        assertEquals(expectedTotalCompensation, actualTotalCompensation, 0.001);
    }

    @Test
    public void testPensionContribution() {
        PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl();
        permanentEmployee.setSalary(80000.0);

        double expectedPensionContribution = 80000.0 * Rate.PENSION_PERCENTAGE;

        double actualPensionContribution = permanentEmployee.pensionContribution(permanentEmployee);

        assertEquals(expectedPensionContribution, actualPensionContribution, 0.001);
    }

    @Test
    public void testCalculateBonus() {
        PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl();
        permanentEmployee.setSalary(60000.0);
        permanentEmployee.setNumberOfServiceYear(3);

        double expectedBonus = 60000.0 * Rate.BONUS_PERCENTAGE * 3;

        double actualBonus = permanentEmployee.calculateBonus(permanentEmployee);

        assertEquals(expectedBonus, actualBonus, 0.001);
    }

    @Test
    public void testToString() {
        PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl();
        permanentEmployee.setName("Jane Doe");
        permanentEmployee.setEmail("jane.doe@example.com");
        permanentEmployee.setAddress("456 Oak St");
        permanentEmployee.setSalary(90000.0);
        permanentEmployee.setNumberOfServiceYear(7);
        permanentEmployee.setBonus(15000.0);
        permanentEmployee.setTotalCompensation(105000.0);

        String expectedToString = "Employee [name=Jane Doe, email=jane.doe@example.com, address=456 Oak St, salary=90000.0, numberOfServiceYear=7, bonus=15000.0, totalCompensation=105000.0]";
        String actualToString = permanentEmployee.toString();

        assertEquals(expectedToString, actualToString);
    }
}
