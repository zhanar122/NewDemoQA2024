package com.demoqa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ClickButton2 {

    WebDriver driver;

    @BeforeMethod
    public void openWeb(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeWeb() throws InterruptedException {
        Thread.sleep(8000);
        driver.close();
        driver.quit();
    }

    @Test
    public void textBox(){
        driver.get("https://demoqa.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elementsCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[text()='Elements']/ancestor::div[@class='card mt-4 top-card']")));
        elementsCard.click();
    }
}
