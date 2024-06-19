package com.demoqa.pages;

import com.demoqa.entities.TextBoxEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.demoqa.drivers.DriverManager.driver;

public class TextBoxPage  extends BasePage {

        // public TextBoxPage(){
        //  PageFactory.initElements(DriverManager.getDriver(), TextBoxPage.class);
        //}

    @FindBy(id = "firstName")
    public WebElement fullNameInput;
    //WebElement getUserNameInput2 = DriverManager.getDriver().findElement(By.id("userName"));

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public  WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    public TextBoxPage fillUpTextBoxForm(String fullName, String email, String currentAddress, String permanentAddress){
        webElementActions.sendKeys(fullNameInput,fullName)
                .sendKeys(emailInput,email)
                .sendKeys(currentAddressInput,currentAddress)
                .sendKeys(permanentAddressInput, permanentAddress)
                .click(submitBtn);
        return this;
    }

    public TextBoxPage fillUpTextBoxForm(TextBoxEntity textBoxEntity){
        webElementActions.sendKeys(fullNameInput,textBoxEntity.getFirstName())
                .jsSendkeys(emailInput, textBoxEntity.getEmail())
                .jsSendkeys(currentAddressInput,textBoxEntity.getCurrentAddress())
                .jsSendkeys(permanentAddressInput,textBoxEntity.getPermanentAddress())
                .click(submitBtn);
        return this;
    }

}
