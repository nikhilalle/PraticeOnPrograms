package AlleNikhil.selenium;

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
import java.util.Set;

public class WindowsHandles {
    @Test
    public void windowsClassUse() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.get("https://www.amazon.in");
        driver.get("https://nxtgenaiacademy.com/multiplewindows");
        driver.manage().window().maximize();

       String window= driver.getWindowHandle();
        System.out.println(window);

        Set<String> windows=driver.getWindowHandles();

        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File source=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File dest=new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\nikhil\\selenium");
        FileUtils.copyFile(source,dest);



        for (String listOfWindows:windows){
            System.out.println(listOfWindows);


            SimpleDateFormat dateFormat=new SimpleDateFormat();
            Date date=new Date();
            System.out.println(dateFormat.format(date));
            System.out.println("------------");

            driver.quit();
        }
    }
}