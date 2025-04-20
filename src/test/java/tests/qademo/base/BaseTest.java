package tests.qademo.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import static com.base.BasePage.driver;
import static com.utilities.BaseUtility.setBaseUtilityDriver;

public class BaseTest {

    public WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        BasePage.setDriver(driver);
        setBaseUtilityDriver();
        homePage = new HomePage();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void takeFailedResultScreenShot(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);

            String targetDirectory = System.getProperty("user.dir") + "/resources/screenshots/";
            String testName = testResult.getName();

            File destination = new File(targetDirectory +
                    "(" + java.time.LocalDate.now() + "-" +
                    (testName != null ? testName : "UnnamedTest") + ".png)");

            try {
                // Ensure the directories exist
                //noinspection ResultOfMethodCallIgnored
                new File(targetDirectory).mkdirs();

                // Copy the screenshot to the target location
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException("Failed to save screenshot", e);
            }

            System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
        }

    }
}
