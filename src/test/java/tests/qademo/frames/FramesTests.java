package tests.qademo.frames;

import org.openqa.selenium.edge.AddHasCasting;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

public class FramesTests extends BaseTest {

    @Test
    public void testFramesBigBox() {
        var framesPage = homePage.goToAlertsFramesWindows().clickFramesButton();

        String actualBigBox = framesPage.getTextInBigFrame();
        String expectedBigBox = "This is a sample page";

        Assert.assertEquals(actualBigBox, expectedBigBox, "Actual and expected text do not match");

        String actualHeaderFrames = framesPage.getHeaderFramesText();
        String expectedHeaderFrames = "Frames";

        Assert.assertEquals(actualHeaderFrames, expectedHeaderFrames,
                "Actual header frame and expected header frames do not match");

    }

    @Test
    public void testFramesSmallBox() {
        var framesPage = homePage.goToAlertsFramesWindows().clickFramesButton();

        String actualSmallBox = framesPage.getTextInSmallFrame();
        String expectedBigBox = "This is a sample page";

        Assert.assertEquals(actualSmallBox, expectedBigBox, "Actual and expected text do not match");

        String actualHeaderFrames = framesPage.getHeaderFramesText();
        String expectedHeaderFrames = "Frames";

        Assert.assertEquals(actualHeaderFrames, expectedHeaderFrames,
                "Actual header frame and expected header frames do not match");
    }

}
