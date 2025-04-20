package com.demoqa.pages.widgets;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.utilities.StringsUtility.getText;
import static com.utilities.WaitUtility.fluentWait;

public class ProgressBarPage extends BasePage {

    private final By startStopButtonLocator = By.id("startStopButton");
    private final By progressBarTextLocator = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

    public void clickStartsStopButton() {
        click(startStopButtonLocator);
    }

    public String getProgressBarText() {
        fluentWait(120, progressBarTextLocator);
        return getText(progressBarTextLocator);
    }

}
