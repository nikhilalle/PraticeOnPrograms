package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GmailAccess {
    WebDriver driver;


    @BeforeMethod
    public void getDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://mail.google.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void loginGmail(){
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("allenikhilalle@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement  password= driver.findElement( By.xpath("//input[@autocomplete='current-password']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       password.sendKeys("Shivani@12345");
       driver.findElement(By.xpath("//span[text()='Next']")).click();

    }

}
