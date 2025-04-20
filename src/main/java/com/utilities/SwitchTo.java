package com.utilities;

import com.beust.ah.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Set;

public class SwitchTo extends BaseUtility {

    private static final Logger log = LoggerFactory.getLogger(SwitchTo.class);

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    private static  Alert waitForAlert(int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.alertIsPresent());
        return switchTo().alert();
    }

    public static String getAlert(int timeOutInSeconds) {
        Alert alert = waitForAlert(timeOutInSeconds);
        return alert.getText();
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
    }

    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }

    public static void setAlertText(String text) {
        switchTo().alert().sendKeys(text);
    }

    public static void switchToFrameString(String value) {
        switchTo().frame(value);
    }

    public static void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    public static void switchToFrameByIndex(int index) {
        switchTo().frame(index);
    }

    public static void switchToFrameByWebElement(WebElement element) {
        switchTo().frame(element);
    }

    public static void switchToWindowHandle(String handle) {
        switchTo().window(handle);
    }



}
