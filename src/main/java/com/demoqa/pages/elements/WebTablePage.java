package com.demoqa.pages.elements;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablePage extends ElementsPage {

    private final By registrationAgeLocator = By.cssSelector("#age");
    private final By submitButtonLocator = By.cssSelector("#submit");
    private final By editButtonLocator = By.id("edit-record-2");

    public void editButton(String email) {
        By edit = By.xpath("//div[text()='%s']//following::span[@title='Edit']".formatted(email));
        click(edit);
    }

    public void setRegistrationAge(String age) {
        setText(registrationAgeLocator, age);
    }

    public void clickSubmitButton() {
        click(submitButtonLocator);
    }

    public String getTableAge(String email) {
        By tableAge = By.xpath("//div[text()='%s']//preceding::div[1]".formatted(email));
        return find(tableAge).getText();
    }
}
