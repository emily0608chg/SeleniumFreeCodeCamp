package tests.qademo.forms;

import com.demoqa.pages.forms.FormsPage;
import com.demoqa.pages.forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        FormsPage formsPage = homePage.gotToForms();
        PracticeFormPage practiceFormPage = formsPage.clickPracticeFormPage();
        practiceFormPage.clickFemaleRadioButton();

        boolean isFemaleRadioButtonSelected = practiceFormPage.isFemaleRadioButtonSelected();

        Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female radio button is selected \n");
    }
}
