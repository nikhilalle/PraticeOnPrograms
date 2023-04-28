package pratice.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class IFrameClass {
    @Test
    public void windowsClassUse() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://secure05b.chase.com/web/auth/dashboard#/dashboard/index/index");
        driver.manage().window().maximize();

        List<WebElement> element=driver.findElements(By.tagName("iframe"));
        System.out.println(element.size());

        driver.switchTo().frame(driver.findElement(By.xpath(" //iframe")));
        }
    }
