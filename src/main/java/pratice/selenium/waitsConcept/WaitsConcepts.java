package pratice.selenium.waitsConcept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitsConcepts {
    @Test
    public void addCartDetails() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS);


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket' and @name='remove-sauce-labs-fleece-jacket']")).click();
        WebElement checkOut = driver.findElement(By.id("checkout"));

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(checkOut)).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("first-name"))).sendKeys("Nikh");

        WebElement surName = driver.findElement(By.id("last-name"));
        wait.until(ExpectedConditions.visibilityOf(surName)).sendKeys("Alle");


        WebElement pinCode = driver.findElement(By.id("postal-code"));
        wait.until(ExpectedConditions.visibilityOf(pinCode)).sendKeys("413005");



//        driver.findElement(By.id("continue")).click();
//        driver.findElement(By.id("finish")).click();
//
//        // Checking For CHECKOUT: COMPLETE or notm
//
//        WebElement checkoutComplete = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
//        System.out.println(checkoutComplete.getText());
//        String actualResult = checkoutComplete.getText();
//        String exceptedResult = "THANK YOU FOR YOUR ORDER";
//        Assert.assertEquals(exceptedResult, actualResult);
//        //done
    }
}
