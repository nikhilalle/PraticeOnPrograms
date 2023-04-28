package AlleNikhil.TestAll.testNgClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
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
    @Test
    public void details() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com");
        driver.manage().window().maximize();

        SimpleDateFormat dateFormat=new SimpleDateFormat();
        Date date=new Date();
        System.out.println(dateFormat.format(date));

      String dateTime=dateFormat.format(date);


        TakesScreenshot obj= (TakesScreenshot) driver;
        File source=obj.getScreenshotAs(OutputType.FILE);
        File dest=new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\nikhil\\TestAll.jpg");

        FileUtils.copyFile(source,dest);


        driver.quit();

    }
}
