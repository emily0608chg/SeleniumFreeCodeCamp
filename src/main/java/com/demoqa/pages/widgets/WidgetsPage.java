package com.demoqa.pages.widgets;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.ProgressBarUI;

import static com.utilities.JavaScriptUtility.scrollToElement;

public class WidgetsPage extends HomePage {

    private final By selectMenuLocator = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private final By datePickerLocator = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");
    private final By progressBarLocator = By.xpath("//li[@id='item-4']/span[text()='Progress Bar']");

    public SelectMenuPage clickSelectMenu() {
        scrollToElement(selectMenuLocator);
        click(selectMenuLocator);
        return new SelectMenuPage();
    }

    public DatePickerPage clickDatePicker() {
        click(datePickerLocator);
        return new DatePickerPage();
    }

    public ProgressBarPage clickProgressBar() {
        scrollToElement(progressBarLocator);
        click(progressBarLocator);
        return new ProgressBarPage();
    }
}
