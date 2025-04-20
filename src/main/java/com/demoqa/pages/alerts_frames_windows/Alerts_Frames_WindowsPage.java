package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.utilities.JavaScriptUtility.scrollToElement;

public class Alerts_Frames_WindowsPage extends HomePage {

    private final By modalDialogButtonLocator = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private final By alertsButtonLocator = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private final By framesButtonLocator = By.xpath("//li[@id='item-2']/span[text()='Frames']");
    private final By windowsButtonLocator = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");

    public ModalDialogsPage clickModalDialogButton() {
        scrollToElement(modalDialogButtonLocator);
        click(modalDialogButtonLocator);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlertsButton() {
        scrollToElement(alertsButtonLocator);
        click(alertsButtonLocator);
        return new AlertsPage();
    }

    public FramesPages clickFramesButton() {
        scrollToElement(framesButtonLocator);
        click(framesButtonLocator);
        return new FramesPages();
    }

    public BrowserWindowsPage clickWindowsPage() {
        scrollToElement(windowsButtonLocator);
        click(windowsButtonLocator);
    return new BrowserWindowsPage();
    }

}
