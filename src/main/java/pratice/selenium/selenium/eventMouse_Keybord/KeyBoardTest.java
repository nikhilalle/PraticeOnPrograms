package pratice.selenium.selenium.eventMouse_Keybord;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardTest {
    @Test
    public void KeyBordVerify() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);

        WebElement userIDKey = driver.findElement(By.id("user-name"));
        actions.keyDown(userIDKey, Keys.SHIFT).sendKeys("nikhilesh").keyUp(Keys.SHIFT).build().perform();
        actions.doubleClick().build().perform();
        WebElement passwordKey = driver.findElement(By.id("password"));
        actions.keyDown(passwordKey, Keys.SHIFT).sendKeys("nikhil%78765").keyUp(Keys.SHIFT).build().perform();

    }
}
