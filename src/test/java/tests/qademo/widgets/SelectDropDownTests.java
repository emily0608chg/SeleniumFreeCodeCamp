package tests.qademo.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

import java.util.List;

public class SelectDropDownTests extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var widgetPages = homePage.goToWidgets();
        var selectMenuPage = widgetPages.clickSelectMenu();

        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.deSelectStandardMultiByValue("volvo");

        List<String> actualSelectedOption = selectMenuPage.getAllStandardMultiValueDropDownElements();

        Assert.assertTrue(actualSelectedOption.contains("Saab"));
        Assert.assertTrue(actualSelectedOption.contains("Audi"));
        Assert.assertFalse(actualSelectedOption.contains("Volvo"));
    }

}
