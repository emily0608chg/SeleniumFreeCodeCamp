package tests.qademo.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.qademo.base.BaseTest;

public class DateTests extends BaseTest {

    @Test
    public void testSelectingDate() {
        String month = "August";
        String year = "1990";
        String day = "6";

        // Ensure day is zero-padded for consistency
        String paddedDay = String.format("%02d", Integer.parseInt(day));


        var widgetPage = homePage.goToWidgets();
        var datePickerPage = widgetPage.clickDatePicker();

        datePickerPage.clickDatePicker();

        String actualDate = datePickerPage.getPickerDate();

        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.selectDay(day);

        String changedDate = datePickerPage.getPickerDate();

        String [] dateParts = datePickerPage.getPickerDate().split("/");
        String actualMonth = datePickerPage.getMonthFromNumber(dateParts[0]);
        String actualDay = dateParts[1];
        String actualYear = dateParts[2];

        Assert.assertNotEquals(actualDate, changedDate);
        Assert.assertTrue(actualMonth.equalsIgnoreCase(month) && actualDay.equals(paddedDay) && actualYear.equals(year),
                "Date changed '%s' does not contains \n Month '%s' or Day '%s' or Year '%s' \n ".formatted(changedDate, month, paddedDay, year));

    }
}
