package tests.qademo.screenshots;

import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

public class CaptureFailedTests extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutScrolling() {
        var formsPage = homePage.gotToForms();
        var practiceFormsPage = formsPage.clickPracticeFormPage();

        practiceFormsPage.clickSubmitButton();


    }
}
