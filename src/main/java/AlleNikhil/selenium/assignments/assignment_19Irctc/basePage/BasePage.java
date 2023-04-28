package AlleNikhil.selenium.assignments.assignment_19Irctc.basePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }


    public WebDriver intBrowser(String url) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        return driver;
    }

    public Properties readProperties() throws IOException {
        File file = new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\nikhil\\selenium\\assignments\\assignment_19Irctc\\basePage\\config.properties");
        FileInputStream inputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }
}



