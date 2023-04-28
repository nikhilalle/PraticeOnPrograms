package AlleNikhil.selenium.faceBookProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public WebDriver driverLink(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        return driver;
    }
}
