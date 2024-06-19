package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.Employee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class WebTablesPage extends BasePage{

    @FindBy(id = "addNewRecordButton")
    public WebElement addNewBtn;

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "age")
    public WebElement ageInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "salary")
    public WebElement salaryInput;

    @FindBy(id = "department")
    public WebElement departmentInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(id = "emailErrorMessage")
    public WebElement emailErrorMessage;

    /*public WebTablesPage addNewEmployee(Employee employee){
        webElementActions.click(addNewBtn)
                .sendKeys(firstNameInput, employee.getFirstname())
                .sendKeys(lastNameInput, employee.getLastname())
                .sendKeys(ageInput, String.valueOf(employee.getAge()))
                .sendKeys(emailInput, employee.getEmail())
                .sendKeys(salaryInput, String.valueOf(employee.getSalary()))
                .sendKeys(departmentInput, employee.getDepartment())
                .click(submitBtn);
        return this;

    }*/

    public WebTablesPage addNewEmployee1(Employee employee) {
        if (!isEmailUnique(employee.getEmail())) {
            System.out.println("Электронная почта " + employee.getEmail() + " уже существует. Пожалуйста, введите уникальную электронную почту.");
            return this;
        }

        webElementActions.click(addNewBtn)
                .sendKeys(firstNameInput, employee.getFirstname())
                .sendKeys(lastNameInput, employee.getLastname())
                .sendKeys(ageInput, String.valueOf(employee.getAge()))
                .sendKeys(emailInput, employee.getEmail())
                .sendKeys(salaryInput, String.valueOf(employee.getSalary()))
                .sendKeys(departmentInput, employee.getDepartment())
                .click(submitBtn);
        return this;
    }

    public boolean isEmailUnique(String email) {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            if (cells.size() > 3 && cells.get(3).getText().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public void deleteEmployeeByEmail(String email) {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            if (cells.size() > 3 && cells.get(3).getText().equals(email)) {
                WebElement deleteButton = row.findElement(By.xpath("(//span[@id='delete-record-2'])[1]"));
                deleteButton.click();
                return;
            }
        }

        throw new NoSuchElementException("Employee with email " + email + " not found.");
    }

    public ArrayList<Employee> getEmployeesFromTable(){
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));

        ArrayList<Employee> employees = new ArrayList<>();

        for (WebElement row: rows){
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            String firstName = cells.get(0).getText();
            String lastName = cells.get(1).getText();
            String ageText = cells.get(2).getText().replaceAll("[^0-9]","");
            String email = cells.get(3).getText();
            String salaryText = cells.get(4).getText();
            String department = cells.get(5).getText();

            if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || email.isEmpty() ||
                    salaryText.isEmpty() || department.isEmpty()){
               continue;
            }

            int age = Integer.parseInt(ageText.trim());
            long salary = Long.parseLong(salaryText.trim());

            employees.add(new Employee(firstName,lastName,age,email,salary,department));
        }
        return employees;
    }


}
