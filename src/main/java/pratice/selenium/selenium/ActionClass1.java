package pratice.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass1 {
    @Test
    public void alert() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);


        driver.findElement(By.xpath("//a[@href='#OKTab' ]"));
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        driver.switchTo().alert().accept();


    }
    @Test
    public void irctc() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //Add chrome switch to disable notification - "**--disable-notifications**"
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        Thread.sleep(2000);
        driver.manage().window().maximize();

    }




    }

