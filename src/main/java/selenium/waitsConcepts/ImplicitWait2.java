package selenium.waitsConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWait2 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void intBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //  driver.manage().window().setSize(new Dimension(4500, 1768));
        driver.manage().window().maximize();
    }

    @Test
    public void registerApplication() {
        System.out.println("   Current  URL  " + driver.getCurrentUrl());
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.xpath("//button[text()='Register']")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.id("FirstName")).sendKeys("Nikhilesh");
        driver.findElement(By.id("LastName")).sendKeys("Alle");
        //WebElement selectElement
        Select se = new Select(driver.findElement(By.name("DateOfBirthDay")));
        se.selectByIndex(11);
        se = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        se.selectByVisibleText("February");
        se = new Select(driver.findElement(By.name("DateOfBirthYear")));
        se.selectByValue("1990");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.id("Email")).sendKeys("autotesting70@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Wipro Pvt Ltd");
        driver.findElement(By.id("Password")).sendKeys("Avanti@8924");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Avanti@8924");
        driver.findElement(By.id("register-button")).click();
    }

    @Test
    public void loginApplication() {
        driver.findElement(By.className("ico-login")).click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
        driver.findElement(By.id("Email")).sendKeys("autotesting70@gmail.com");
        //wait.until(ExpectedConditions.visibilityOf((WebElement) By.id("Password")));
        driver.findElement(By.id("Password")).sendKeys("Avanti@8924");
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']")));
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    @AfterMethod
    public void tearDown() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("dfdcs")));
//        wait.until(ExpectedConditions.titleIs("abx"));
//        WebDriverWait webDriverWait=new WebDriverWait(driver,12);
//        webDriverWait.until(ExpectedConditions.titleIs("edede"));
        driver.quit();
    }

}
