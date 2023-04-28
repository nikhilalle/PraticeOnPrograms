package pratice.selenium.selenium;
import org.openqa.selenium.TakesScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotsTest {
    public String getCurrentTimeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss").format(new Date());}
    @Test
    public void ScreenShots() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement title=driver.findElement(By.xpath("//span[text()='Products']"));
        System.out.println(title.getText());
        String  actualTitle=title.getText();
        System.out.println(actualTitle);
        String date=getCurrentTimeStamp();
        System.out.println(date);


        TakesScreenshot screenshot=(TakesScreenshot) driver;

        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

        File  destinationFile=new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\nikhil\\selenium\\selenium\\screenShots"+date+".jpg");

        FileUtils.copyFile(sourceFile,destinationFile);
    }

    }


