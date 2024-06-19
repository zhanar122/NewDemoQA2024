package com.demoqa.pages;

import com.demoqa.entities.PracticeFormEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

import static com.demoqa.drivers.DriverManager.driver;

public class PracticeFormPage extends BasePage {

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(xpath = "//label[text()='Male']")
    private WebElement genderMaleInput;

    @FindBy(xpath = "//label[text()='Female']")
    private WebElement genderFemaleInput;

    @FindBy(xpath = "//label[text()='Other']")
    private WebElement genderOtherInput;

    @FindBy(id = "userNumber")
    private WebElement mobileNumberInput;

    @FindBy(id = "subjectsInput")
    private WebElement subjectsInput;

    @FindBy(xpath = "//label[text()='Sports']")
    private WebElement hobbiesSportsInput;

    @FindBy(xpath = "//label[text()='Reading']")
    private WebElement hobbiesReadingInput;

    @FindBy(xpath = "//label[text()='Music']")
    private WebElement hobbiesMusicInput;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPictureInput;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressInput;

    @FindBy(id = "react-select-3-input")
    private WebElement SelectStateInput;

    @FindBy(id = "react-select-4-input")
    private WebElement SelectCityInput;

    @FindBy(id = "submit")
    private WebElement submitButtonInput;

    @FindBy(id = "closeLargeModal")
    private WebElement closeLargeInput;

    private String[] states = {"NCR", "Uttar Pradesh", "Haryana","Rajasthan"};
    private String[][] cities = {
            {"Delhi", "Gurgaon", "Noida", },
            {"Agra", "lucknow", "Merrut", },
            {"karnal", "Panipat" },
            {"Jaipur", "Jaiselmer"},
    };

    public PracticeFormPage fillForm(PracticeFormEntity practiceFormEntity) throws InterruptedException {

        webElementActions.sendKeys(firstNameInput, practiceFormEntity.getFirstName())
                .sendKeys(lastNameInput, practiceFormEntity.getLastName())
                .sendKeys(emailInput, practiceFormEntity.getEmail())
                .click(getRandomGenderInput())
                .sendKeys(mobileNumberInput, practiceFormEntity.getMobileNumber())
                .sendKeysWithEnter(subjectsInput, practiceFormEntity.getSubjects())
                .sendKeysWithEnter(subjectsInput, practiceFormEntity.getSubjects2())
                .click(getRandomHobbiesInput())
                .sendKeys(uploadPictureInput, practiceFormEntity.getUploadPicture())
                .sendKeys(currentAddressInput, practiceFormEntity.getCurrentAddress());
        String randomState = getRandomState();
        webElementActions.sendKeysWithEnter(SelectStateInput, randomState);
        String randomCity = getRandomCityForState(randomState);
        webElementActions.sendKeysWithEnter(SelectCityInput, randomCity);
        webElementActions.click(submitButtonInput);
        Thread.sleep(3000);
        webElementActions.click(closeLargeInput);
        Thread.sleep(3000);
        return this;
    }

    private WebElement getRandomGenderInput() {
        WebElement[] genderInputs = {genderMaleInput, genderFemaleInput, genderOtherInput};
        int randomIndex = new Random().nextInt(genderInputs.length);
        return genderInputs[randomIndex];
    }

    private WebElement getRandomHobbiesInput() {
        WebElement[] hobbiesInputs = {hobbiesSportsInput, hobbiesReadingInput, hobbiesMusicInput};
        int randomIndex = new Random().nextInt(hobbiesInputs.length);
        return hobbiesInputs[randomIndex];
    }

    private String getRandomState() {
        Random random = new Random();
        int index = random.nextInt(states.length);
        return states[index];
    }

    private String getRandomCityForState(String state) {
        int stateIndex = -1;
        for (int i = 0; i < states.length; i++) {
            if (states[i].equals(state)) {
                stateIndex = i;
                break;
            }
        }

        if (stateIndex == -1) {
            return "";
        }

        String[] citiesForState = cities[stateIndex];
        Random random = new Random();
        int index = random.nextInt(citiesForState.length);
        return citiesForState[index];
    }

}
