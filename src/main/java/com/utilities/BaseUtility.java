package com.utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class BaseUtility {

    public static WebDriver driver;

    public static void setBaseUtilityDriver(){
        driver = BasePage.driver;
    }
}
