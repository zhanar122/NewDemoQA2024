package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.demoqa.drivers.DriverManager.driver;

public class ButtonsPage extends BasePage {

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickBtn;

    //public final String doubleClickMessage = DriverManager.getDriver().findElement(By.id("doubleClickMessage")).getText();

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickMessage;

}
