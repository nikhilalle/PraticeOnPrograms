package pratice.selenium.selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest  {
    @Test
    public void alert() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Alert alert1=driver.switchTo().alert();
        Thread.sleep(500);
        alert1.accept();

        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert alert2=driver.switchTo().alert();
        Thread.sleep(1000);
        alert2.dismiss();

        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert alert3=driver.switchTo().alert();
        Thread.sleep(1000);
        alert3.sendKeys("Nikhilesh");
        alert3.accept();
WebElement finish=driver.findElement(By.xpath("//p[text()='Hello Nikhilesh How are you today']"));
boolean data=finish.isDisplayed();

        Assert.assertTrue(data);
    }
}
