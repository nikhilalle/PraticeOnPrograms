package AlleNikhil.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment14_JavaScriptExecutorTest {
    @Test
    public void verifyJSExecutor() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        /**
        *  Java Script Executor is An Interface So
        *  We Can't Create  an of Interface then we do in Type_Casting on Diver
        *  i.e (JavascriptExecutor) driver [Driver is Type_Cast to JavascriptExecutor ]
        *  using js reference we can use JavascriptExecutor Methods
         **/

        JavascriptExecutor js=(JavascriptExecutor) driver;
          // 1.Scroll Bar Up to Bottom
        Thread.sleep(5000);
        js.executeScript(" window.scrollTo(0,document.body.scrollHeight)");
        // 2.Scroll Bar Bottom to Up
        js.executeScript("  window.scrollTo(0,0)");
        //3.Page Back
        js.executeScript("history.back()");
         //4.Page Forward
        js.executeScript("history.forward()");
        // Get Title
       String title= js.executeScript("return document.title").toString();
        System.out.println(title);
        // Get Url
        String url =js.executeScript("return document.URL").toString();
        System.out.println(url);









    }
}
