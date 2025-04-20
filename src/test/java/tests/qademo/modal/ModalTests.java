package tests.qademo.modal;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

public class ModalTests extends BaseTest {

    @Test
    public void testModalDialog() {
        var afwPage = homePage.goToAlertsFramesWindows();
        var modalDialogPage = afwPage.clickModalDialogButton();

        modalDialogPage.clickSmallModalButton();

        String actualText = modalDialogPage.getSmallModalText();

        Assert.assertTrue(actualText.contains("small modal"), "Actual text '%s Does not contains 'Small modal'".formatted(actualText));

         modalDialogPage.closeSmallModalText();
    }
}
