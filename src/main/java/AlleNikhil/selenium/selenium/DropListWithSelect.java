package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropListWithSelect {
    @Test
    public void addToCart() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.globalsqa.com/demo-site/select-dropdown-menu");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//p/select"));
        Select select=new Select(element);
        select.selectByIndex(4);
        select.selectByValue("AUT");



    }
}
