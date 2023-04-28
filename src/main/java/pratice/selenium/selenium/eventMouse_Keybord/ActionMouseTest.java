package pratice.selenium.selenium.eventMouse_Keybord;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionMouseTest {
    @Test
    public void verifyMouseAction() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");

        WebElement desktopElement=driver.findElement(By.xpath("//li//a[text()='Desktops']"));
        Thread.sleep(5000);

        Actions actions=new Actions(driver);
        actions.moveToElement(desktopElement).build().perform();

       driver.findElements(By.xpath("//*[@id='narbar-menu']//li[1]//ul//li//a")).get(0).click();

    }
}
