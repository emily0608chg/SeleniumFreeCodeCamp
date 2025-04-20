package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameLocator = By.id("user-name");
    private By passwordLocator = By.name("password");
    private By loginButtonLocator = By.id("login-button");
    private By errorMessageLocator = By.cssSelector("#login_button_container h3");


    public String getErrorMessage(){
        return find(errorMessageLocator).getText();
    }

    public void setUsername(String username) {
        setText(usernameLocator, username);
    }

    public void setPassword(String password) {
        setText(passwordLocator, password);
    }

    public void clickLoginButton() throws InterruptedException {
        click(loginButtonLocator);
        Thread.sleep(2000);
    }

    public ProductsPage clickLogin(){
        try {
            clickLoginButton();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new ProductsPage();
    }

    public ProductsPage clickLoginButtonAndGoToProductsPage(String username, String password){
        setUsername(username);
        setPassword(password);
        return clickLogin();
    }

}
