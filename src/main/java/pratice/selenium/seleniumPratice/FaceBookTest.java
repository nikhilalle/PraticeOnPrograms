package pratice.selenium.seleniumPratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FaceBookTest {
    @Test
    public void faceBookLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(2000);

        WebElement day = driver.findElement(By.id("day"));

        Select select = new Select(day);
        select.selectByValue("27");
        Thread.sleep(2000);
        WebElement Month = driver.findElement(By.id("month"));
        Select select1 = new Select(Month);
        select1.selectByVisibleText("Feb");
        Thread.sleep(2000);
        WebElement year = driver.findElement(By.id("year"));
        Select select2 = new Select(year);
        select2.selectByValue("1996");

    }

}
