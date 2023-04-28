package AlleNikhil.TestAll.testNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.annotations.Test;

public class FinByAnnotation {

@FindBy(id = "user-name")
    WebElement txtname;
@FindBy(id = "password")
WebElement password;
@FindBy(id = "login-button")
WebElement btn;
@Test
    public void initBrowser(){

        WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
            txtname.sendKeys("standard_user");
           password.sendKeys("secret_sauce");
            btn.click();
    }
}
