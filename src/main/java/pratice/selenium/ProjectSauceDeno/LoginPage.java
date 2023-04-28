package pratice.selenium.ProjectSauceDeno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userLogin(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket' and @name='remove-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.id("checkout")).click();
    }

    public void addToCart(String name, String surname) {
        driver.findElement(By.id("first-name")).sendKeys(name);
        driver.findElement(By.id("last-name")).sendKeys(surname);
        driver.findElement(By.id("postal-code")).sendKeys("413005");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
    }
}
