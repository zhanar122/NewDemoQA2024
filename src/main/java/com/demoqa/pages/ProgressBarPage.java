package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.demoqa.drivers.DriverManager.driver;

public class ProgressBarPage extends BasePage{

    @FindBy(id = "startStopButton")
    public WebElement startStopBtn;

    @FindBy(xpath = "//div[@role='progressbar']")
    public WebElement progressBar;
    public WebElement startStopButton;


    public void clickStartStopButton() {
        startStopBtn.click();
    }

    public String getProgressBarValue() {
        return progressBar.getAttribute("ariaValueNow");
    }

}

