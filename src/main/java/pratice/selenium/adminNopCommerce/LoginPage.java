package pratice.selenium.adminNopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public void login(WebDriver driver){

        WebElement userName = driver.findElement(By.id("Email"));
        userName.clear();
        userName.sendKeys("admin@yourstore.com");

        WebElement userPassword = driver.findElement(By.name("Password"));
        userPassword.clear();
        userPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();
    }
}
