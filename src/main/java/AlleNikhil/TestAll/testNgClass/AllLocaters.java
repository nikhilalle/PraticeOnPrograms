package AlleNikhil.TestAll.testNgClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllLocaters {
    @Test
    public void locatorsAll() {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("admin123");
        driver.findElement(By.name("passwd")).sendKeys("Admin");
        driver.findElement(By.id("SubmitLogin")).click();

    }
}