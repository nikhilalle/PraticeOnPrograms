package pratice.selenium.adminNopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasePage {
    @Test
    public WebDriver webdriverLink(){
        System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.manage().window().maximize();
        return driver;
    }
}
