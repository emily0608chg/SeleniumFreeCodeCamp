package tests.qademo.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckBox() {
        var formsPage = homePage.gotToForms();
        var practiceFormPage = formsPage.clickPracticeFormPage();
        practiceFormPage.clickReadingHobbyCheckbox();

         boolean isReadingBoxChecked = practiceFormPage.isReadingSelected();

        Assert.assertTrue(isReadingBoxChecked, "Reading box is checked");

        practiceFormPage.unClickReadingHobbyCheckbox();

        boolean isReadingBoxUnChecked = practiceFormPage.isReadingSelected();

        Assert.assertFalse(isReadingBoxUnChecked, "Reading box is unchecked");
    }
}
