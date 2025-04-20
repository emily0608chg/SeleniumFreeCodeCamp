package com.demoqa.pages.alerts_frames_windows;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.utilities.StringsUtility.getText;

public class ModalDialogsPage extends Alerts_Frames_WindowsPage {

    private final By showSmallModalButtonLocator = By.id("showSmallModal");
    private final By showSmallModalTextLocator = By.xpath("//div[contains(text(), 'small modal')]");
    private final By closeSmallModalButtonLocator = By.id("closeSmallModal");
    private final By showLargeModalButtonLocator = By.id("showLargeModal");
    private final By showLargeModalTextLocator = By.xpath("//div[@class='modal-body']/p");

    public void clickSmallModalButton() {
        click(showSmallModalButtonLocator);
    }

    public String getSmallModalText() {
        return getText(showSmallModalTextLocator);
    }

    public void closeSmallModalText() {
        click(closeSmallModalButtonLocator);
    }

    public void clickLargeModalButton() {
        click(showLargeModalButtonLocator);
    }
}
