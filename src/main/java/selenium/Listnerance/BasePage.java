package selenium.Listnerance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;

    public WebDriver getDriver(WebDriver driver) {
        return driver;
    }

    public void browserInti() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("");
        driver.manage().window().maximize();
    }

    public void propertiesFile() throws IOException {
       File file=new File("byedghuguyfg");
       FileInputStream fin=new FileInputStream(file);
       prop=new Properties();
       prop.load(fin);
    }
}
