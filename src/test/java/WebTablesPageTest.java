import com.demoqa.entities.Employee;
import com.demoqa.pages.WebTablesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

public class WebTablesPageTest extends BaseTest{

    @Test(description = "Delete employee by email")
    public void testDeleteEmployeeByEmail() throws InterruptedException {
        driver.get("https://demoqa.com/webtables");
        deleteEmployeeByEmail("alden@example.com");
        Thread.sleep(7000);
    }


    @Test(description = "Add new employee and ensure unique email")
    public void testAddNewEmployee() throws InterruptedException {
        driver.get("https://demoqa.com/webtables");
        Employee employee = new Employee("John", "Doe", 30, "john.doe@example.com", 10000, "HR");
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.addNewEmployee1(employee);
        Thread.sleep(7000);
    }

    public void deleteEmployeeByEmail(String email) {
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage.deleteEmployeeByEmail(email);
    }



}
