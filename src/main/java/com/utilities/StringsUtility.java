package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class StringsUtility extends BaseUtility{

    public static String getWindowHandle() {
        return driver.getWindowHandle();
    }

    public static Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    public static String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public static String getAttribute(By locator, String attribute) {
        return driver.findElement(locator).getDomAttribute(attribute);
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }
}
