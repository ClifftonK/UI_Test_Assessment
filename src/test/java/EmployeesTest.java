import org.junit.BeforeClass;
import org.junit.Test;
import page.Employees;
import providers.EmployeesStringsProvider;

import java.security.Provider;
import java.util.HashMap;

import static org.junit.Assert.*;

public class EmployeesTest extends BaseTest {

    @Test
    public void testUserCanClicksDropDown() {
        //click dropdown
        Employees employees = new Employees(initDriver());
        employees.clickDropDown();
        // TODO assert the table values
    }

    @Test
    public void testUserCanClickCheckBox() {
        Employees employees = new Employees(initDriver());
        employees.clickCheckBox();
        assert employees.getCheckBoxStatus();
    }


    @Test
    public void testUserCanUncheckCheckBox() {
        Employees employees = new Employees(initDriver());
        employees.clickCheckBox(); //click checkbox to select
        employees.clickCheckBox(); //click checkbox to unselect
//        assertFalse employees.getCheckBoxStatus(); //todo assert not equal to
    }

    @Test void testCorrectStringIsDisplayed() {
        Employees employees = new Employees(initDriver());
        employees.clickDropDown();
        employees.clickCheckBox();
        employees.clickButton();

        assertEquals(employees.getStringFromTextField(), EmployeesStringsProvider.getResponse("", ""));
    }

    /**
     * Have a map of the city to name
     * @return
     */
    private HashMap<String, String> NameToCityMap() {
        return null;
    }
}
