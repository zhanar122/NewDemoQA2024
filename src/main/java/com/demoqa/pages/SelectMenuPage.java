package com.demoqa.pages;

import com.demoqa.entities.SelectMenuEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.demoqa.drivers.DriverManager.driver;

public class SelectMenuPage extends BasePage {

    @FindBy(id = "//div[@id='react-select-2-group-0-heading' and contains(text(), 'Group 1')]")
    private WebElement group1Input;

    @FindBy(id = "//div[@id='react-select-2-option-0-0' and contains(text(), 'Group 1, option 1')]\n")
    private WebElement option1Input;

    @FindBy(id = "//div[@id='react-select-2-option-0-1' and contains(text(), 'Group 1, option 2')]")
    private WebElement option2Input;

    @FindBy(id = "//div[@id='react-select-2-group-1-heading' and contains(text(), 'Group 2')]")
    private WebElement group2Input;

    @FindBy(id = "//div[@id='react-select-2-option-1-0' and contains(text(), 'Group 2, option 1')]")
    private WebElement option11Input;

    @FindBy(id = "//div[@id='react-select-2-option-1-1' and contains(text(), 'Group 2, option 2')]")
    private WebElement option22Input;

    @FindBy(id = "//div[@id='react-select-2-option-2' and contains(text(), 'A root option')]")
    private WebElement rootInput;

    @FindBy(id = "//div[@id='react-select-2-option-3' and contains(text(), 'Another root option')]")
    private WebElement anotherRootInput;

    @FindBy(id = "//div[contains(@class, 'css-1wa3eu0-placeholder') and text()='Select Title']")
    private WebElement selectTitleInput;

    @FindBy(id = "//div[@id='react-select-3-option-0-0' and @tabindex='-1' and text()='Dr.']")
    private WebElement DrInput;

    @FindBy(id = "//div[@id='react-select-3-option-0-1' and @tabindex='-1' and text()='Mr.']")
    private WebElement MrInput;

    @FindBy(id = "//div[@id='react-select-3-option-0-2' and @tabindex='-1' and text()='Mrs.']")
    private WebElement MrsInput;

    @FindBy(id = "//div[@id='react-select-3-option-0-3' and @tabindex='-1' and text()='Ms.']")
    private WebElement MsInput;

    @FindBy(id = "//div[@id='react-select-3-option-0-4' and @tabindex='-1' and text()='Prof.']")
    private WebElement ProfInput;

    @FindBy(id = "//div[@id='react-select-3-option-0-5' and @tabindex='-1' and text()='Other']")
    private WebElement OtherInput;

    @FindBy(id = "oldSelectMenu")
    private WebElement selectMenu;


    public void printAllOptions(SelectMenuEntity selectMenuEntity) {
        Select select = new Select(selectMenu);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        System.out.print(selectMenuEntity);
    }


}
