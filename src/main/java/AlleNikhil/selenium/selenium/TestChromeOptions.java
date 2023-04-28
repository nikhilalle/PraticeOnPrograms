package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestChromeOptions {
    @Test
    public void pageTest(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions option=new ChromeOptions();
       // option.addArguments("start-maximized");
        option.addArguments("start-maximized");
        option.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        option.addArguments("incognito");
        option.addArguments("disable-extensions");
        String version= String.valueOf(option.addArguments("version"));
        System.out.println(version);

       WebDriver driver=new ChromeDriver(option);
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
    }

