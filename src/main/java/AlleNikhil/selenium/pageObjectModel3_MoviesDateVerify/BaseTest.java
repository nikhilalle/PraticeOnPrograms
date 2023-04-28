package AlleNikhil.selenium.pageObjectModel3_MoviesDateVerify;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;
    public WebDriver initBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        return driver;
    }
}
