package com.demoqa.pages.elements;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends HomePage {


    private final By webTablesLocator = By.xpath("//span[text()='Web Tables']");
    private final By linkLocator = By.xpath("//span[text()='Links']");
    private final By dynamicPropertiesBoxLocator = By.xpath("//span[text()='Dynamic Properties']");

    public WebTablePage goToWebTables() {
        click(webTablesLocator);
        return new WebTablePage();
    }

    public LinksPage goToLinks() {
        click(linkLocator);
        return new LinksPage();
    }

    public DynamicProperties goToDynamicsProperties() {
        click(dynamicPropertiesBoxLocator);
        return new DynamicProperties();
    }
}
