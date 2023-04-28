package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstloginPage {
    @Test
    public void firstPage(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        /** Html Element Location for Find Element For UserName We use to this Loction to Find UserName Tag in
         * HTML and Insert User-Name in to its  Location
           *  Same as PASSWORD
         *  Find Location And Enter Password On it
         */

        WebElement userName= driver.findElement(By.id("user-name"));
        System.out.println(userName);

        // send or Set User Name in Automation perpouse

        userName.sendKeys("standard_user");

        WebElement passwordCheck=driver.findElement(By.id("password"));

        // send or Set Password in Automation perpouse

        passwordCheck.sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(By.id("login-button"));

        // Click on Login button
        btnLogin.click();

        /** Html Element Location for Product Title We use to this Loction to Find Page & Tag
         * <span class="title">Products</span>
          */
       WebElement pageTitle= driver.findElement(By.className("title"));

       boolean verifyTitle=pageTitle.isDisplayed();
        Assert.assertTrue(verifyTitle);


    }

}
