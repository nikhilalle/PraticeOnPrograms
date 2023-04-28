package AlleNikhil.selenium.ProjectSauceDeno;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public WebDriver webLink(){

            System.setProperty("webdriver.chrome.driver", "D:\\Chrome New\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            return driver;
    }
}
