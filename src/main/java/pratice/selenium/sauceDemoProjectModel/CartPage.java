package pratice.selenium.sauceDemoProjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage {
    WebDriver driver;

    CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket' and @name='remove-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.id("checkout")).click();
    }

    public void verifycheckoutComplete() {
        WebElement checkoutComplete = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
        System.out.println(checkoutComplete.getText());
        String actualResult = checkoutComplete.getText();
        String exceptedResult = "THANK YOU FOR YOUR ORDER";

        Assert.assertEquals(exceptedResult, actualResult);
    }
}
