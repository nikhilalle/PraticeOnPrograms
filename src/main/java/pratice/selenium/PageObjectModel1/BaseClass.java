package pratice.selenium.PageObjectModel1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
    WebDriver driver;
    public WebDriver getDriver(){
        return driver;
    }
      public void init(){
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          driver.get("https://www.saucedemo.com/");
          driver.manage().window().maximize();
    }
}
