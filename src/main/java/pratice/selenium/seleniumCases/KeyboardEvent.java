package pratice.selenium.seleniumCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class KeyboardEvent {
    @Test
    public void keyBoardCase() {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));

        actions.keyDown(userName, Keys.SHIFT).sendKeys("nikhil").keyUp(userName, Keys.SHIFT).build().perform();

        WebElement userPassword = driver.findElement(By.id("password"));
        actions.keyDown(userPassword, Keys.SHIFT).sendKeys("nikhil234").keyUp(userPassword, Keys.SHIFT).build().perform();


        driver.findElement(By.id("login-button")).click();
    }
    }
