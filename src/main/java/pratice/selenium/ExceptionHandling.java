package pratice.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionHandling {
    @Test
    public void firstPage(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        WebElement userName= driver.findElement(By.id("user-name"));
        WebElement passwordCheck=driver.findElement(By.id("password"));
        WebElement btnLogin = driver.findElement(By.id("login-button"));

        userName.sendKeys("standard_user");
        passwordCheck.sendKeys("secret_sauce");

        driver.navigate().refresh();
        try {
            userName= driver.findElement(By.id("user-name"));
           passwordCheck=driver.findElement(By.id("password"));
             btnLogin = driver.findElement(By.id("login-button"));
            userName.sendKeys("standard_user");
             passwordCheck.sendKeys("secret_sauce");
        }
        catch (Exception ex){

            ex.printStackTrace();
            System.out.println( ex.getMessage());
            System.out.println("Error");
                   }
        btnLogin.click();

    }

}


