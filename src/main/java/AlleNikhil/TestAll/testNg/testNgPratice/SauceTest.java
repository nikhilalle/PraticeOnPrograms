package AlleNikhil.TestAll.testNg.testNgPratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceTest {

    @Parameters({"user","userPassword"})
    @Test
    // (@Optional("standard_user")  is will be assigned her by Directly with invoking Xml File using @Optional
    public void loginPage(@Optional("standard_user")String userName, String password){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    @Parameters({"browerName","user","userPassword"})
    @Test
    // // @Optional("https://www.saucedemo.com") is will be assigned her by Directly with invoking Xml File using @Optional
    public void loginPage1(@Optional("https://www.saucedemo.com") String domain,String userName,String password)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(domain);
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
}
