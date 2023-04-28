package AlleNikhil.selenium.COPYPASTE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPaste {
    @Test
    public void CopyPasteEvent() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket' and @name='remove-sauce-labs-fleece-jacket']")).click();
        WebElement checkOut = driver.findElement(By.id("checkout"));
        checkOut.click();

        Actions actions = new Actions(driver);

        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement surName = driver.findElement(By.id("last-name"));

        actions.moveToElement(firstName).click().sendKeys("Techsum Software");
        actions.keyDown(Keys.CONTROL).sendKeys("a");
        actions.sendKeys("c");
        actions.moveToElement(surName).click().keyDown(Keys.CONTROL).sendKeys("v");
        actions.keyUp(Keys.CONTROL).build().perform();

    }
    

    @Test
    public void addCartDetails() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket' and @name='remove-sauce-labs-fleece-jacket']")).click();
        WebElement checkOut = driver.findElement(By.id("checkout"));
        checkOut.click();
// Copy And Paste Keyboard Event
        Actions actions = new Actions(driver);

        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement surName = driver.findElement(By.id("last-name"));

        actions.moveToElement(firstName).click().sendKeys("Techsum Software");

        // Select Value i.e Select ALL Ctr + A
        actions.keyDown(Keys.CONTROL).sendKeys("a");

        // Copy  Value i.e Copy Ctr + C
        actions.sendKeys("c");
        // Paste  Value i.e Paste Ctr + V
        actions.moveToElement(surName).click().keyDown(Keys.CONTROL).sendKeys("v");
        actions.keyUp(Keys.CONTROL).build().perform();

    }

}
