package pratice.selenium.seleniumCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Keyboard2 {
    @Test
    public void eventKeyboard() {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("");
    }
}
