package AlleNikhil.TestAll.testNg.listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListenersClass implements ITestListener {
    WebDriver driver;
    @Test
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("Test Failure");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        String date = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss").format(new Date());
        System.out.println(date);

        File destFile = new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\AlleNikhil\\TestAll\\testNg"+date+".jpg");
        try {
            FileUtils.copyFile(sourceFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
