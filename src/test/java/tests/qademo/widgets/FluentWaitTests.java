package tests.qademo.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

public class FluentWaitTests extends BaseTest {

    @Test
    public void fluentWaitTest() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();

        progressBarPage.clickStartsStopButton();

        String actual = progressBarPage.getProgressBarText();

        Assert.assertNotEquals(actual, "100%", "ProgressBar time was modified");
    }
}
