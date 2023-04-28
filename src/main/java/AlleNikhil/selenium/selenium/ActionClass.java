package AlleNikhil.selenium.selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
    @Test
    public void actionClassUse() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);

        WebElement userName=driver.findElement(By.id("twotabsearchtextbox"));
actions.keyDown(userName, Keys.SHIFT).sendKeys("redmi note 11 +").keyUp(userName,Keys.SHIFT).build().perform();


        WebElement subBtn=driver.findElement(By.id("nav-search-submit-button"));
        actions.moveToElement(subBtn).click(subBtn).build().perform();


        WebElement item=driver.findElement(By.xpath("//span[text()='Redmi Note 11 Pro + 5G (Stealth Black, 6GB RAM, 128GB Storage) | 67W Turbo Charge | 120Hz Super AMOLED Display | Additional Exchange Offers | Charger Included| Get 2 Months of YouTube Premium Free!']"));
        actions.moveToElement(item).click().build().perform();

        WebElement cart=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
actions.moveToElement(cart).click(cart).build().perform();

    }
}
