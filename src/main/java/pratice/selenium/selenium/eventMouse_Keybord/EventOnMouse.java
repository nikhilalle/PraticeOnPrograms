package pratice.selenium.selenium.eventMouse_Keybord;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EventOnMouse {
    @Test
    public void verifyMouseEvent() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        WebElement listOfDesktopItems = driver.findElement(By.xpath("//div[@id='narbar-menu']//ul//li//a[text()='Desktops']"));
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(listOfDesktopItems).build().perform();
        driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]//li[1]//ul/li[2]//a")).click();

        driver.findElement(By.xpath("//div[@class='list-group mb-3']//a[text()='Components (2)']")).click();

        driver.findElement(By.xpath("//div[@class='col-sm-3']//ul//li//a[text()='Monitors (2)']")).click();


    }
}
