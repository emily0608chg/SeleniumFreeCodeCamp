package tests.qademo.alerts;

import com.utilities.SwitchTo;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

import static com.utilities.SwitchTo.*;

public class AlertsTests extends BaseTest {



    @Test
    public void testInformationAlerts() {
        String expectedAlertText = "You clicked a button";

        var afwPages = homePage.goToAlertsFramesWindows();
        var alertPage = afwPages.clickAlertsButton();

        alertPage.clickSeeAlert();

        Assert.assertEquals(getAlert(5000), expectedAlertText);

       acceptAlert();
    }

    @Test
    public void testConfirmationAlert() {
        String expectedAlertText = "You selected Cancel";

        var alertPage = homePage.goToAlertsFramesWindows().clickAlertsButton();
        alertPage.clickConfirmAlert();

        dismissAlert();

        String confirmationResult = alertPage.getConfirmResultAlertText();

        Assert.assertEquals(confirmationResult, expectedAlertText,
                "Comfirmation result alert is not equals to '%s".formatted(expectedAlertText));
    }

    @Test
    public void testPromptAlert() {
        String alertText = "Testing selenium with Java";
        String expectedResult = "Your entered " + alertText;

        var alertsPage = homePage.goToAlertsFramesWindows().clickAlertsButton();

        alertsPage.clickPromptAlert();

      setAlertText(alertText);
        acceptAlert();

        String actualResult = alertsPage.getPromptResultAlertText();

        Assert.assertEquals(actualResult,expectedResult,
                "Prompt result alert message is not equal to expected '%s'".formatted(alertText));
    }
}
