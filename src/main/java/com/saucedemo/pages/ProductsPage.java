package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private By productsHeaderLocator = By.xpath("//span[text()='Products']");



    public boolean isHeaderDisplayed(){
        return find(productsHeaderLocator).isDisplayed();
    }

}
