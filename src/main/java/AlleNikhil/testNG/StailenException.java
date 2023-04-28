package AlleNikhil.testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StailenException extends Throwable {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.pavanonlinetrainings.com/");

        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.xpath("//a[text()='Testimonials']"));
        link.click();

        driver.navigate().back();
        try {
            link.click();
        }

//      catch (StaleElementReferenceException ex)
//      {
//          link= driver.findElement(By.xpath("//a[text()='Testimonials']"));
//      link.click();
//
//    }
        finally {

        }
}
}
