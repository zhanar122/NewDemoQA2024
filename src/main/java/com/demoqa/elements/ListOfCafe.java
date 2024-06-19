package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class ListOfCafe {

    @Test
    void  findFoodList() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://dostavka312.kg/category/11");
        List<WebElement> listOfCafe = driver.findElements(By.xpath("//div[@class='panel-heading']/p[1]"));
        List<WebElement> listOfCafeAddress = driver.findElements(By.xpath("//div[@class='panel-heading']/p[2]"));
        int i = 0;
        for (WebElement cafe:listOfCafe){

            System.out.println("Name of Cafe: " + cafe.getText());
            System.out.println("Address: " + listOfCafeAddress.get(i).getText());
            System.out.println();
            i++;
        }
        System.out.println(listOfCafe.size());

        WebElement submitButton = driver.findElement(By.xpath("(//a[@class='btn btn-success pull-right'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButton).click().perform();
        Thread.sleep(2000);

        List<WebElement> listOfBreakfest = driver.findElements(By.xpath("//div[@class='food-title']"));

        List<WebElement> foodList = driver.findElements(By.xpath("//div[@class='food-title']"));

        for (WebElement food : foodList ){
            System.out.println(food.getText());
            System.out.println("___________________________________________________________________________________");


        }
        System.out.println(foodList.size());

    }
}


