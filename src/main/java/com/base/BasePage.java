package com.base;

import com.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BasePage {

    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {


        BasePage.driver = driver;
    }


    public void waitForElementToBeVisible(By locator, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement find(By locator) {
        return new WebDriverWait(
                driver,
                Duration.ofSeconds(10))
                .until(
                        ExpectedConditions.presenceOfElementLocated(locator)
                );
    }

    protected void setText(By locator, String text) {
        waitForElementToBeVisible(locator, Duration.ofSeconds(10L));
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator) {
       try {
           find(locator).click();
       } catch (Exception e) {
           throw new RuntimeException("Error to trying clicking an element", e);
       }
    }
}

