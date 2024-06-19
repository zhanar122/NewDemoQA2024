package com.demoqa.drivers;

import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            switch (ConfigReader.getValue("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver(); // добавлена инициализация FirefoxDriver
                    break;
                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }
        }
        return driver;
    }
    public static void closeDriver(){
        try {
            if(driver != null){
                driver.quit(); // заменено close() на quit()
                driver = null;
            }
        } catch (Exception e) {
            System.err.println("Error while closing driver: " + e.getMessage());
        }
    }
}
