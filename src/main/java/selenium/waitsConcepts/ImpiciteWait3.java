package selenium.waitsConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImpiciteWait3 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void intBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().getPosition();
        // driver.manage().window().setSize(new Dimension(4500, 1768));

    }

    @Test
    public void registerApplication() {
       // System.out.println("   Current  URL  " + driver.getCurrentUrl());


        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.xpath("//button[text()='Register']")).click();
        driver.findElement(By.id("gender-male")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Nikhilesh");
        driver.findElement(By.id("LastName")).sendKeys("Alle");

        Select se = new Select(driver.findElement(By.name("DateOfBirthDay")));
        se.selectByIndex(11);
        se = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        se.selectByVisibleText("February");
        se = new Select(driver.findElement(By.name("DateOfBirthYear")));
        se.selectByValue("1990");

        driver.findElement(By.id("Email")).sendKeys("autotesting70@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Wipro Pvt Ltd");
        driver.findElement(By.id("Password")).sendKeys("Avanti@8924");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Avanti@8924");
        driver.findElement(By.id("register-button")).click();
    }

    @Test
    public void loginApplication() {
        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("autotesting70@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("Avanti@8924");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}


