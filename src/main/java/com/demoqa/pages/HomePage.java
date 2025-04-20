package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.alerts_frames_windows.Alerts_Frames_WindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.demoqa.pages.interactions.Interactions;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.utilities.JavaScriptUtility.scrollToElement;


public class HomePage extends BasePage {

    private final By formsCardLocator = By.xpath("//h5[text()='Forms']");
    private final By elementsCardLocator = By.xpath("//h5[text()='Elements']");
    private final By widgetsCardLocator = By.xpath("//h5[text()='Widgets']");
    private final By alertsFrameWindowsCardLocator = By.xpath("//h5[text()='Alerts, Frame & Windows']");
    private final By interactionsCardLocator = By.xpath("//h5[text()='Interactions']");

    public FormsPage gotToForms() {
        scrollToElement(formsCardLocator);
        click(formsCardLocator);
        return new FormsPage();
    }

    public ElementsPage gotToElements() {
        scrollToElement(elementsCardLocator);
        click(elementsCardLocator);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElement(widgetsCardLocator);
        click(widgetsCardLocator);
        return new WidgetsPage();
    }

    public Alerts_Frames_WindowsPage goToAlertsFramesWindows() {
        scrollToElement(alertsFrameWindowsCardLocator);
        click(alertsFrameWindowsCardLocator);
        return new Alerts_Frames_WindowsPage();
    }

    public Interactions goToInteractions() {
        scrollToElement(interactionsCardLocator);
        click(interactionsCardLocator);
        return new Interactions();
    }
}
