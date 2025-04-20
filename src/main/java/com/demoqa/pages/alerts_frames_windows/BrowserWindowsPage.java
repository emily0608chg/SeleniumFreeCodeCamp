package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static com.utilities.StringsUtility.getWindowHandle;
import static com.utilities.StringsUtility.getWindowHandles;
import static com.utilities.SwitchTo.switchToWindowHandle;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage {


    private final By newTabLocator = By.id("tabButton");
    private final By newWindowLocator = By.id("windowButton");
    private final By newMessageWindowLocator = By.id("messageWindowButton");

    public void clickNewTabWindow() {
        click(newTabLocator);
    }

    public void clickNewWindow() {
        click(newWindowLocator);
    }

    public void clickMessageWindowLocator() {
        click(newMessageWindowLocator);
    }

    public void switchToNewWindow() {
        // step 1: Get the current "Main" window handle
        String currentHandle = getWindowHandle();
        System.out.println("Main window ID:" + currentHandle + "\n");

        // step 2: Get all windows handles
        Set<String> allHandles = getWindowHandles();
        System.out.println("Of open windows = " + allHandles.size());

        // step 3 switch to new window handle using the window handle

        for (String handle : allHandles) {
            if (handle.equals(currentHandle)) {
                System.out.println("1st window ID is: " + handle);
            } else {
                switchToWindowHandle(handle);
                System.out.println("2nd window handle");
            }
        }
    }
}
