package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPage {
    WebDriver driver;

        @BeforeMethod
        public void initBrowser(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get("http://automationpractice.com/index.php");
            driver.manage().window().maximize();
        }
        @Test
    public void signInContactUs(){
            driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
            WebElement selectList=driver.findElement(By.id("id_contact"));

            Select select=new Select(selectList);
            select.selectByVisibleText("Customer service");
        driver.findElement(By.id("email")).sendKeys("alle@gmail.com");
        driver.findElement(By.id("id_order")).sendKeys("12345");
        driver.findElement(By.id("message")).sendKeys("Test New Messages on New Page");
        driver.findElement(By.id("submitMessage")).click();

        String successMessage=driver.findElement(By.xpath("//p[text()='Your message has been successfully sent to our team.']")).getText();
            System.out.println(successMessage);
            String actualMessage="Your message has been successfully sent to our team.";
            Assert.assertEquals(successMessage,actualMessage);
        }
        @AfterMethod
    public void tearDown(){
            driver.close();
        }

    }

