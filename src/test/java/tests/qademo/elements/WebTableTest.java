package tests.qademo.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void tedtWebTable () {
        String email = "cierra@example.com";
        String age = "26";

        var webTablePage = homePage.gotToElements();
        var webTable = webTablePage.goToWebTables();
        webTable.editButton(email);

        webTable.setRegistrationAge(age);

        webTable.clickSubmitButton();
        String actualAge = webTable.getTableAge(email);

        Assert.assertEquals(actualAge,  age, "\n Actual & Expected Ages do not match \n ");
    }
}
