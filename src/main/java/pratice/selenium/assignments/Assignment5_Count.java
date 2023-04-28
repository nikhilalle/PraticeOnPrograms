package pratice.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment5_Count {
    @Test
    public void addCartDetails() {
        System.setProperty("webdriver.chrome.driver", "D:\\Chrome New\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        List<WebElement> getListOfCards = driver.findElements(By.xpath("//*[@class=\"inventory_list\"]/div/div[2]/div[2]/button"));
        System.out.println("get count of cards ="+getListOfCards.size()); // print number of cards

driver.quit();
//done
    }
}