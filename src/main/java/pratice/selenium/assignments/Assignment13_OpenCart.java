package pratice.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment13_OpenCart {
    @Test
    public void keyboardCopyPaste() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://demo.opencart.com/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
        actions.click(myAccount).build().perform();
        WebElement registerElement = driver.findElement(By.xpath("//a[text()='Register']"));
        actions.click(registerElement).build().perform();
        WebElement userFirStName = driver.findElement(By.id("input-firstname"));
        actions.contextClick(userFirStName).sendKeys("Nikhilesh").build().perform();
        WebElement userLastName = driver.findElement(By.id("input-lastname"));
        actions.contextClick(userLastName).sendKeys("Alle").build().perform();
        WebElement userEMailId = driver.findElement(By.id("input-email"));
        actions.contextClick(userEMailId).sendKeys("nikhilalle@gmail.com").build().perform();

            //  WebElement useEmailPassword = driver.findElement(By.xpath("//input[@id='input-password']"));
           //  actions.contextClick(useEmailPassword).sendKeys("nikhil@alle345").build().perform();
          //  useEmailPassword.sendKeys("nikhil@alle345");
         // useEmailPassword.click();

        actions.moveToElement(userFirStName).doubleClick().build().perform();

        // catch here is double click on the text will by default select the text
        // now apply copy command

        driver.findElement(By.id("input-firstname")).sendKeys(Keys.chord(Keys.CONTROL, "c"));

        // now apply the command to paste

        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
        WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
        actions.moveToElement(desktop).click(). build().perform();
        driver.findElement(By.xpath("//a[text()='PC (0)']")).click();
        WebElement  laptopsNotebooks=driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        actions.moveToElement(laptopsNotebooks).click(). build().perform();
        driver.findElement(By.xpath("//a[text()='Macs (0)']")).click();
        WebElement  laptopsNotebooks1=driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        actions.moveToElement(laptopsNotebooks1).click(). build().perform();
        driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']")).click();



        // Done
    }
}
