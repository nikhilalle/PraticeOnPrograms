package AlleNikhil.selenium.seleniumPratice;

import com.matrix.dhanshri.selenium.Navigation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationTest {
    @Test
    public void verifyNavigation() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver  driver=new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.navigate().to("https://www.flipkart.com/");
        driver.navigate().to("https://www.amazon.in/");
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        System.out.println("-------Navigation---------");
        driver.get("https://www.flipkart.com/");
        driver.get("https://www.saucedemo.com/");

        driver.get("https://www.amazon.in/");
        driver.get("https://www.facebook.com/");
        WebDriver.Navigation nav=driver.navigate();
        System.out.println("-------Get_Url---------");

        nav.to("https://www.saucedemo.com/");
        nav.to("https://www.amazon.in/");
        URL url=new URL("https://www.flipkart.com/");
       driver.navigate().to(url);
       driver.manage().window().maximize();
       driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        nav.refresh();
        nav.back();
        nav.forward();

            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
            driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
            driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket' and @name='remove-sauce-labs-fleece-jacket']")).click();
            driver.findElement(By.id("checkout")).click();
            nav.back();
            nav.back();
            nav.forward();
            nav.refresh();
            nav.forward();
            nav.forward();
        nav.back();
        nav.back();
        nav.back();
        nav.back();
        nav.back();
        nav.back();
        nav.back();
        nav.back();
        nav.back();
        nav.back();
        nav.back();
        nav.back();
        nav.back();
        nav.forward();





        }


    }

