package tests.qademo.elements;

import com.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

public class DynamicWaitsTests extends BaseTest {

    @Test
    public void dynamicWaitTests() {
        var dynamicPropertiesPage = homePage.gotToElements().goToDynamicsProperties();

        String getActualText = dynamicPropertiesPage.getVisibleAfterText();

        String expectedText = "Visible After 5 Seconds";

        Assert.assertEquals(getActualText, expectedText, "Text is visible %s".formatted(getActualText));

    }
}
