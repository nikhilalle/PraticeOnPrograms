package selenium.pageFactorySauceDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    WebDriver driver;
    Properties pro;

    public WebDriver getDriver() {

        return driver;
    }

    public void intiBrowser() throws IOException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(pro.getProperty("url"));
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    public void propertiesFile() throws IOException {
        File file = new File("D:\\NIkhil Java Notes\\Test JAVA 2023\\src\\main\\java\\selenium\\pageFactorySauceDemo\\Sauce.Config.properties ");
        FileInputStream fin = new FileInputStream(file);
        pro = new Properties();
        pro.load(fin);


    }
}
