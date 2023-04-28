package AlleNikhil.selenium.seleniumPratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Navigation1 {

    @Test
    public void navigationTools() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.navigate().refresh();


        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.in/");
        driver.navigate().back();
        driver.navigate().back();
        driver.get("https://www.flipkart.com/");
        driver.navigate().to("https://www.flipkart.com/");
        driver.navigate().to("https://www.amazon.in/");
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();


    }
}
