package pratice.selenium.COPYPASTE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPaste2 {
    @Test
    public void addCartDetails() {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc0MjA4MzA3LCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement surName = driver.findElement(By.name("lastname"));

        Actions actions=new Actions(driver);
        actions.moveToElement(firstName).click().sendKeys("Nikhilesh Alle");
        actions.keyDown(Keys.CONTROL).sendKeys("A");
        actions.sendKeys("C");
        actions.moveToElement(surName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

    }
}
