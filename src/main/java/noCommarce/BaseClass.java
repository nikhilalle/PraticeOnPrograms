package noCommarce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class BaseClass {
    Properties properties;
    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void intiBrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.navigate().to(readProperties().getProperty("URL"));
        driver.get("https://www.nopcommerce.com/en/demo");
        driver.manage().window().maximize();
    }

    public Properties readProperties() throws IOException {
        File file = new File("D:\\NIkhil Java Notes\\Test JAVA 2023\\src\\main\\java\\noCommarce\\Config.properties");
        FileInputStream fin = new FileInputStream(file);
        properties = new Properties();
        properties.load(fin);
        return properties;
    }

}
