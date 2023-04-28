package pratice.selenium.seleniumAll;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DynamicXpath {
    @Test
    public void addToCart() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        String productName = "Corporate Travel";


// Here, we have created a dynamic xpath

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(5000,8000)");
        WebElement details = driver.findElement(By.xpath("//p[@class='latoBlack font10 appendBottom10 capText' and text()='" + productName + "']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(details).click().build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);

    }

}
//    Product Offering
//    MakeMyTrip
//    About the Site
//    Quick Links
//    Important Links
//     Corporate Travel
