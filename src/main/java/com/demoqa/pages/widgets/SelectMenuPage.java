package com.demoqa.pages.widgets;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import static com.utilities.DropDownUtility.*;
import static com.utilities.JavaScriptUtility.scrollToElement;

public class SelectMenuPage extends BasePage {

    private final By standardMultiSelectLocator = By.id("cars");

    public void selectStandardMulti(String text) {
        scrollToElement(standardMultiSelectLocator);
        selectByVisibleText(standardMultiSelectLocator, text);
    }

    public void selectStandardMulti(int index) {
        scrollToElement(standardMultiSelectLocator);
        selectByIndex(standardMultiSelectLocator, index);
    }

    public void deSelectStandardMultiByValue(String text) {
        scrollToElement(standardMultiSelectLocator);
        deSelectByValue(standardMultiSelectLocator, text);
    }

    public List<String> getAllStandardMultiValueDropDownElements() {
        return getAllSelectedOptions(standardMultiSelectLocator);
    }
}
