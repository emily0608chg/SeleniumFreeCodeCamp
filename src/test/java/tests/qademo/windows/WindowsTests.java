package tests.qademo.windows;

import com.utilities.BaseUtility;
import com.utilities.StringsUtility;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

import static com.utilities.StringsUtility.getUrl;

public class WindowsTests extends BaseTest {

    @Test
    public void testNewWindowUrl() {


        var windowsPage = homePage.goToAlertsFramesWindows().clickWindowsPage();

        windowsPage.clickNewWindow();
        windowsPage.switchToNewWindow();

        String actualUrl = getUrl();
        String expectedUrl = "https://demoqa.com/sample";
        Assert.assertEquals(actualUrl, expectedUrl, "Actual and expected URLs do not match");
    }
}
