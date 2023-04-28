package IrctcIndianRail;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseClass {
    WebDriver driver;
    public void getDriver(WebDriver driver){
        driver=this.driver;
    }

    public void intiBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("");
    }
    public void propertiesFiles(){

    }

}
