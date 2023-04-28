package AlleNikhil.selenium.sauceProjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   WebDriver driver;

    LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void logindata(String username,String password){
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();


    }


}
