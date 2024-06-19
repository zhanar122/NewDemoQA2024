package com.demoqa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class BasicLocators {

    @Test(description = "Find by ID")
    void findByIdTest(){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\DemoQAWinter2024\\src\\main\\resources\\drivers\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            //driver.get("https://demoqa.com/links");
            driver.get("https://demoqa.com/text-box");

            //Home
            //WebElement homeLink = driver.findElement(By.partialLinkText("Bad"));
            //homeLink.click();

            WebElement homeLink = driver.findElement(By.cssSelector("#userName"));
            homeLink.sendKeys("Bishkek 312");

            String permanentAddressTxt = driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
            System.out.println(permanentAddressTxt);

            WebElement fullNameInput = driver.findElement(By.linkText("input"));
            fullNameInput.sendKeys("John Doe");

            String textBoxText = driver.findElement(By.tagName("h1")).getText();
            System.out.println(textBoxText);

    }
}
