package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.utilities.JavaScriptUtility.scrollToElement;
import static com.utilities.StringsUtility.getText;
import static com.utilities.WaitUtility.explicitWait;

public class DynamicProperties extends ElementsPage {

    private final By visibleAfterButtonLocator = By.id("visibleAfter");

    public void clickVisibleAfterButton() {
        scrollToElement(visibleAfterButtonLocator);
        explicitWait(6000, visibleAfterButtonLocator);
    }

    public String getVisibleAfterText() {
        explicitWait(6000, visibleAfterButtonLocator);
        return getText(visibleAfterButtonLocator);
    }
}
