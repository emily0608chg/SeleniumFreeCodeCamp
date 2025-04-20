package tests.saucedemo.login;

import tests.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage() {
        loginPage.clickLoginButtonAndGoToProductsPage("standar_user", "34533");
        String errorMessage = loginPage.getErrorMessage();

        Assert.assertTrue(errorMessage.contains("Epic sadface"));
    }
}
