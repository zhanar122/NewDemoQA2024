package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.demoqa.drivers.DriverManager.driver;

public class AlertPage extends BasePage {

    @FindBy(id = "confirmButton")
    public WebElement confirmButton;

}
