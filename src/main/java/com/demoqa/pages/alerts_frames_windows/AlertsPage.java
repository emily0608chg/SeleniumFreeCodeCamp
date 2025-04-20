package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.utilities.StringsUtility.getText;

public class AlertsPage extends Alerts_Frames_WindowsPage {

    private final By seeAlertButtonLocator = By.id("alertButton");
    private final By timerAlertButtonLocator = By.id("timerAlertButton");
    private final By confirmButtonLocator = By.id("confirmButton");
    private final By promptButtonLocator = By.id("promtButton");
    private final By confirmResultAlertTextLocator = By.id("confirmResult");
    private final By promptResultAlertTextLocator = By.id("promptResult");

    public void clickSeeAlert() {
        click(seeAlertButtonLocator);
    }

    public void clickTimerAlert() {
        click(timerAlertButtonLocator);
    }

    public void clickConfirmAlert() {
        click(confirmButtonLocator);
    }

    public void clickPromptAlert() {
        click(promptButtonLocator);
    }

    public String getConfirmResultAlertText() {
        return getText(confirmResultAlertTextLocator);
    }

    public String getPromptResultAlertText() {
        return getText(promptResultAlertTextLocator);
    }

}
