package pratice.listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Group1 {
    WebDriver driver;
    ITestListener iTestListener;

    @BeforeMethod
    public void intiBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
     @Test
    public void login(ITestListener result){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         driver.findElement(By.id("login-button")).click();

     }
}
