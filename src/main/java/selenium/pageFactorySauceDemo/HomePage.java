package selenium.pageFactorySauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class HomePage {
    WebDriver driver;
    Properties prop;
    HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void login(){
        driver.findElement(By.id("username")).sendKeys(prop.getProperty("userName"));
        driver.findElement(By.id("username")).sendKeys(prop.getProperty("userPassword"));

    }

}
