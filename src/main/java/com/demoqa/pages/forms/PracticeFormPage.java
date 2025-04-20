package com.demoqa.pages.forms;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.utilities.JavaScriptUtility.clickElementsJS;
import static com.utilities.JavaScriptUtility.scrollToElement;

public class PracticeFormPage extends FormsPage {

    private By femaleGenderRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private final By submitButtonLocator = By.id("submit");

    public void clickFemaleRadioButton() {
        scrollToElement(femaleGenderRadioButton);
        clickElementsJS(femaleGenderRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleGenderRadioButton).isSelected();
    }

    public void clickSportHobbyCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElement(sportsHobbyCheckbox);
            clickElementsJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingHobbyCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElement(readingHobbyCheckbox);
            clickElementsJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicHobbyCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElement(musicHobbyCheckbox);
            clickElementsJS(musicHobbyCheckbox);
        }
    }

    public void unClickReadingHobbyCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElement(readingHobbyCheckbox);
            clickElementsJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickSubmitButton() {
        click(submitButtonLocator);
    }
}
