package AlleNikhil.selenium.sauceProjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public WebDriver link(){
        System.setProperty("webdriver.chrome.driver", "D:\\Chrome New\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        return driver;
    }
}
