package AlleNikhil.testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleException2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.name("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        driver.navigate().refresh();


        try {
            userName.sendKeys("standard_user");
            password.sendKeys("secret_sauce");

        } catch (StaleElementReferenceException ex) {

            userName = driver.findElement(By.name("user-name"));
            userName.sendKeys("standard_user");
            password = driver.findElement(By.name("password"));
            password.sendKeys("secret_sauce");
        }
    }
}