package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotTest {
    public  String getTimeStamp(){
        return new SimpleDateFormat("mm-yyyy-dd-hh-ss").format(new Date());
    }
    @Test
    public  void getScreenShots() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String date=getTimeStamp();
        System.out.println(date);
        driver.manage().window().maximize();


        TakesScreenshot screenShot=(TakesScreenshot)driver;
        File source=screenShot.getScreenshotAs(OutputType.FILE);
       File destination=new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\nikhil\\selenium\\selenium"+date+".jpg");
        FileUtils.copyFile(source,destination);
    }
}
