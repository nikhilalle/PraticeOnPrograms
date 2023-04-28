package AlleNikhil.selenium.selenium.eventMouse_Keybord;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionMouse {


     @Test
     public void verifyMouseEvents() throws InterruptedException {
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://demo.guru99.com/test/simple_context_menu.html");

          WebElement btnRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
          Actions actions = new Actions(driver);
          actions.contextClick(btnRightClick).build().perform();
          driver.findElement(By.xpath("//li//span[text()='Cut']"));
          Thread.sleep(2000);
          driver.switchTo().alert().accept();

     }

     @Test
     public void mouseEvent() throws InterruptedException {
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://demo.guru99.com/test/simple_context_menu.html");
          WebElement doubleChick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
          Actions actions = new Actions(driver);
          Thread.sleep(4000);
          actions.doubleClick(doubleChick).build().perform();

          driver.switchTo().alert().accept();
     }
}
