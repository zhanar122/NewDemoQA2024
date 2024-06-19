package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class TextBox {

    @Test
    void textBoxTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Janar");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("zhakubai@gmail.com");
        Thread.sleep(2000);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Automation street 1");
        Thread.sleep(2000);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Java street 2");
        Thread.sleep(2000);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(2000);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebElement nameResult = driver.findElement(By.id("name"));
        WebElement emailResult = driver.findElement(By.id("email"));
        WebElement currentAddressResult = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        WebElement permanentAddressResult = driver.findElement(By.xpath("//p[@id='permanentAddress']"));


        System.out.println("Name: " + nameResult.getText());
        System.out.println("Email: " + emailResult.getText());
        System.out.println("Current Address: " + currentAddressResult.getText());
        System.out.println("Permanent Address: " + permanentAddressResult.getText());


        assertEquals("Name:Janar", nameResult.getText());
        assertEquals("Email:zhakubai@gmail.com", emailResult.getText());
        assertEquals("Current Address :Automation street 1", currentAddressResult.getText().trim());
        assertEquals("Permanent Address :Java street 2", permanentAddressResult.getText().trim());
        driver.quit();
    }
}
