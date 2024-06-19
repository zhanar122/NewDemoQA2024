package com.demoqa.elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class ClickButton {

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

        /*@Test
        void textBoxTest() throws InterruptedException {
            driver.get("https://demoqa.com/");

            WebElement element = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().perform();
            Thread.sleep(3000);

            WebElement checkBox = driver.findElement(By.xpath("(//li[@class='btn btn-light '])[2]"));
            actions.moveToElement(checkBox).click().perform();
            Thread.sleep(3000);

            WebElement button = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[1]"));
            actions.moveToElement(button).click().perform();
            Thread.sleep(3000);

            WebElement desktop = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[2]"));
            actions.moveToElement(desktop).click().perform();
            Thread.sleep(3000);

            WebElement select = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
            actions.moveToElement(select).click().perform();
            Thread.sleep(3000);

            WebElement documents = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[3]"));
            actions.moveToElement(documents).click().perform();
            Thread.sleep(3000);

            WebElement select1 = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[5]"));
            actions.moveToElement(select1).click().perform();
            Thread.sleep(3000);

            WebElement downloads = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[6]"));
            actions.moveToElement(downloads).click().perform();
            Thread.sleep(3000);

            WebElement select2 = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[8]"));
            actions.moveToElement(select2).click().perform();
            Thread.sleep(3000);

            List<WebElement> resultElements = driver.findElements(By.className("text-success"));
            String resultTextString = resultElements.stream()
                    .map(WebElement::getText)
                    .collect(Collectors.joining(" "));

            Assert.assertTrue(resultTextString.contains("desktop"), "Result text does not contain 'desktop'");
            Assert.assertTrue(resultTextString.contains("notes"), "Result text does not contain 'notes'");
            Assert.assertTrue(resultTextString.contains("commands"), "Result text does not contain 'commands'");

            System.out.println(resultTextString);

        }*/


            @Test
            public void clickTest() throws InterruptedException {
                driver.get("https://demoqa.com/");

                String[][] actionsArray = {
                        {"(//div[@class='card mt-4 top-card'])[1]", "3000"},
                        {"(//li[@class='btn btn-light '])[2]", "3000"},
                        {"(//button[@class='rct-collapse rct-collapse-btn'])[1]", "3000"},
                        {"(//button[@class='rct-collapse rct-collapse-btn'])[2]", "3000"},
                        {"(//span[@class='rct-checkbox'])[2]", "3000"},
                        {"(//button[@class='rct-collapse rct-collapse-btn'])[3]", "3000"},
                        {"(//span[@class='rct-checkbox'])[5]", "3000"},
                        {"(//button[@class='rct-collapse rct-collapse-btn'])[6]", "3000"},
                        {"(//span[@class='rct-checkbox'])[8]", "3000"}
                };

                Actions actions = new Actions(driver);

                for (String[] action : actionsArray) {
                    String xpath = action[0];
                    int sleepTime = Integer.parseInt(action[1]);

                    WebElement element = driver.findElement(By.xpath(xpath));
                    actions.moveToElement(element).click().perform();
                    Thread.sleep(sleepTime);
                }

                List<WebElement> resultElements = driver.findElements(By.className("text-success"));
                String resultTextString = resultElements.stream()
                        .map(WebElement::getText)
                        .collect(Collectors.joining(" "));

                Assert.assertTrue(resultTextString.contains("desktop"), "Result text does not contain 'desktop'");
                Assert.assertTrue(resultTextString.contains("notes"), "Result text does not contain 'notes'");
                Assert.assertTrue(resultTextString.contains("commands"), "Result text does not contain 'commands'");

                System.out.println(resultTextString);

            }

}