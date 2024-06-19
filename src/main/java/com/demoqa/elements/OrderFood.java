package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderFood {

        WebDriver driver;

        @BeforeMethod
        public void openWeb(){
            System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().window().maximize();
        }

        @AfterMethod
        public void closeWeb() throws InterruptedException {
            Thread.sleep(7000);
            driver.close();
            driver.quit();
        }

        @Test
        void textBoxTest() throws InterruptedException {
            driver.get("https://dostavka312.kg/category/11");

            WebElement menu = driver.findElement(By.xpath("(//a[@class='btn btn-success pull-right'])[1]"));
            menu.click();
            Thread.sleep(2000);

            WebElement menu2 = driver.findElement(By.xpath("(//input[@class='quantity-controls quantity-plus'])[1]"));
            menu2.click();
            Thread.sleep(2000);

            WebElement menu3 = driver.findElement(By.xpath("(//button[@class='btn btn-yellow btn-sm btn-addcart'])[1]"));
            menu3.click();
            Thread.sleep(2000);


            WebElement submitButton = driver.findElement(By.xpath("(//div[@class='icon_pulse'])[1]"));
            Actions actions = new Actions(driver);
            actions.moveToElement(submitButton).click().perform();
            Thread.sleep(2000);

            WebElement menu5 = driver.findElement(By.xpath("(//a[@class='btn btn-yellow'])"));
            menu5.click();
            Thread.sleep(2000);

            WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Ваше имя']"));
            userName.sendKeys("Janar");
            Thread.sleep(2000);

            WebElement currentAddress = driver.findElement(By.xpath("//input[@placeholder='Адрес']"));
            currentAddress.sendKeys("Aitmatov 312");
            Thread.sleep(2000);

            WebElement userPhone = driver.findElement(By.xpath("//input[@placeholder='Ваш телефон']"));
            userPhone.sendKeys("0501001005");
            Thread.sleep(2000);

            WebElement exchange = driver.findElement(By.xpath("//input[@placeholder='Сдача с']"));
            exchange.sendKeys("1000");
            Thread.sleep(2000);

            WebElement comment = driver.findElement(By.xpath("//textarea[@placeholder='Примечания и специальные запросы']"));
            comment.sendKeys("Sonunken");
            Thread.sleep(2000);

            WebElement menu6 = driver.findElement(By.xpath("(//button[@class='btn btn-yellow btn-lg btn-savecart'])"));
            menu6.click();

        }
}
