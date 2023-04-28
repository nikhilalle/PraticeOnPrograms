package AlleNikhil.TestAll.testNg.testNgAllCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceParallelTest {

    @Test
    public void verifyLogin() {
        System.out.println("Login Thread ID: " +Thread.currentThread().getId());
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        boolean productsTitle = driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
        Assert.assertTrue(productsTitle);
    }

    @Test
    public void verifyTitle() {
        System.out.println("Title Thread ID: " +Thread.currentThread().getId());
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Swag Labs";

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
