package pratice.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCaseFail {


    WebDriver driver;

    @Test
    public void verifyTitle() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://www.saucedemo.com/");

        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();

        System.out.println("Actual Title :" + actualTitle);

        String expectedTitle = "Swag Labs";

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void tearDown(ITestResult result) throws IOException {


         {
            // Take Screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File sourceFile = ts.getScreenshotAs(OutputType.FILE);

            String date = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss").format(new Date());
            System.out.println(date);

            File destFile = new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\AlleNikhil\\selenium" + date + ".jpg");
            FileUtils.copyFile(sourceFile, destFile);

        }
    }
}

