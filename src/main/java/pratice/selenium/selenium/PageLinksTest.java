package pratice.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PageLinksTest {
        WebDriver driver;
        @BeforeMethod
        public  void intiBrowser(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get("https://www.flipkart.com");
            driver.manage().window().maximize();
        }
        @Test
        public void verifyPage()  {
            List<WebElement> urlLinks= driver.findElements(By.tagName("a"));

            System.out.println("Total Links In This Page :  "+urlLinks.size());

            for (WebElement links:urlLinks) {
                String allLinks = links.getAttribute("href");
                System.out.println(" Service Code " +allLinks);
            }
        }
        @AfterMethod
        public void tearDown(){
            driver.close();
        }

    }

