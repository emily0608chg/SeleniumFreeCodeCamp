package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtility extends BaseUtility{

    // Constructor que recibe WebDriver

    public static Select findDropDown(By locator) {
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String text) {
       findDropDown(locator).selectByVisibleText(text);
    }

    public static void selectByValue(By locator, String value) {
        findDropDown(locator).selectByValue(value);
    }

    public static void selectByIndex(By locator, int index) {
        findDropDown(locator).selectByIndex(index);
    }

    public static String getSelectedOption(By locator) {
        return findDropDown(locator).getFirstSelectedOption().getText();
    }

    public static List<String> getAllSelectedOptions(By locator) {
      List<WebElement> allSelectedOption = findDropDown(locator).getAllSelectedOptions();
      return allSelectedOption.stream()
              .map(WebElement::getText).collect(Collectors.toList());
    }

    public static void deSelectByValue(By locator, String value) {
        findDropDown(locator).deselectByValue(value);
    }

}
