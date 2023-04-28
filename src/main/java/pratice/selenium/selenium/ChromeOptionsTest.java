package pratice.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.sql.Time;

public class ChromeOptionsTest {
    @Test
    public void chromeSettings(){
        WebDriverManager.chromedriver().setup();
       ChromeOptions chromeOptions=new ChromeOptions();

        chromeOptions.addArguments("start-maximized");
        chromeOptions.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
        chromeOptions.addArguments("--incognito");
        //chromeOptions.addArguments("--headless");

        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
}
}
