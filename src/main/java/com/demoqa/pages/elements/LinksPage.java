package com.demoqa.pages.elements;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksPage extends ElementsPage {

    private final By badRequestLinkLocator = By.id("bad-request");
    private final By badResponseLinkLocator = By.id("linkResponse");


    public void clickBadRequestLink() {
        click(badRequestLinkLocator);
    }

    public String getBadRequestResponseText() {
        return find(badResponseLinkLocator).getText();
    }

}
