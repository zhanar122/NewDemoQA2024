package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.demoqa.drivers.DriverManager.driver;

public class MenuPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"nav\"]/li[2]/a")
    public WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"nav\"]/li[2]/ul")
    public WebElement sublist;

    @FindBy(xpath = "//*[@id=\"nav\"]/li[2]/ul/li[1]/a")
    public WebElement subItem2;


}
