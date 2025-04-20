package tests.qademo.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

public class LinksTests extends BaseTest {

    @Test
    public void testLinks() {
        var elementsPage = homePage.gotToElements();
        var linksPage = elementsPage.goToLinks();
        linksPage.clickBadRequestLink();

        String actualResponse = linksPage.getBadRequestResponseText();

        Assert.assertFalse(
                actualResponse.contains("400") &&
                        actualResponse.contains("Bad Request"),
                "Actual response '%s' \n Does not contains '400' or 'Bad Request' \n".formatted(actualResponse));
    }
}
