package com.demoqa.pages.widgets;


import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.utilities.DropDownUtility.selectByVisibleText;
import static com.utilities.StringsUtility.getAttribute;

public class DatePickerPage extends BasePage {

    private final By datepickerLocator = By.id("datePickerMonthYearInput");
    private final By monthPickerLocator = By.cssSelector(".react-datepicker__month-select");
    private final By yearPickerLocator = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day) {
        return By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='%s']".formatted(day));
    }

    public boolean isDateInMonth(String day) {
        return find(dayValue(day)).isDisplayed();
    }

    public void clickDatePicker() {
        click(datepickerLocator);
    }

    public String getPickerDate() {
        return getAttribute(datepickerLocator, "value");
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthPickerLocator, month);
    }

    public void selectYear(String year) {
        selectByVisibleText(yearPickerLocator, year);
    }

    public void selectDay(String day) {
        click(dayValue(day));
    }

    public String getMonthFromNumber(String monthNumber) {
        return switch (monthNumber) {
            case "01" -> "January";
            case "02" -> "February";
            case "03" -> "March";
            case "04" -> "April";
            case "05" -> "May";
            case "06" -> "June";
            case "07" -> "July";
            case "08" -> "August";
            case "09" -> "September";
            case "10" -> "October";
            case "11" -> "November";
            case "12" -> "December";
            default -> throw new IllegalArgumentException("Invalid month number: " + monthNumber);
        };
    }


}
