package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.math3.analysis.function.Power;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class BrokenLinks {
    WebDriver driver;
    @BeforeMethod
    public void webIntiBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }
    @Test
    public void brokenLinkPage(){
        List<WebElement> linksOnPage=driver.findElements(By.tagName("a"));
        System.out.println(linksOnPage.size());

        for(WebElement element:linksOnPage){
            String links=element.getAttribute("href");
            System.out.println(links);

        }

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
