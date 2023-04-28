package pratice.selenium.seleniumCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionTest {
    @Test
    public void ActionCase(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Actions  actions=new Actions(driver);

        WebElement clickElement=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(clickElement).build().perform();
        Alert alert=driver.switchTo().alert();
       alert.accept();
        WebElement rightclickElement= driver.findElement(By.xpath("//*[@id='authentication']/span"));
        actions.contextClick(rightclickElement).build().perform();
    }
}
