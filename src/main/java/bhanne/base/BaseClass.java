package bhanne.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    public WebDriver initBrowser(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

    public Properties readProperties() throws IOException {
        //String projectPath = System.getProperty("user.id");
        File file = new File("D:\\JAVA NEW 2022\\Test\\src\\main\\java\\bhanne\\config.properties");
        FileInputStream fin = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fin);
        return prop;


    }

}
