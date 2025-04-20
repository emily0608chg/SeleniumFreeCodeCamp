package com.demoqa.pages.forms;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.utilities.JavaScriptUtility.scrollToElement;

public class FormsPage extends HomePage {

    private By practiceFormPageLocator = By.xpath("//span[text()='Practice Form']");

    public PracticeFormPage clickPracticeFormPage() {
        scrollToElement(practiceFormPageLocator);
        click(practiceFormPageLocator);
        return new PracticeFormPage();
    }
}
