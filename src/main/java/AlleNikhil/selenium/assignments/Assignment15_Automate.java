package AlleNikhil.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;

import java.util.ArrayList;
import java.util.List;

public class Assignment15_Automate {
    @Test
    public void addCart() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationpractice.com/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement womenElement = driver.findElement(By.xpath("//li//a[text()='Women']"));
        actions.moveToElement(womenElement).click().build().perform();
        WebElement tShirtElement = driver.findElement(By.xpath("//ul[@style='display: none;']//li//a[text()='T-shirts']"));
        WebElement printedSummerDress = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[5]/div/div[2]/h5/a"));
        actions.moveToElement(printedSummerDress).build().perform();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[5]/div/div[2]/div[2]/a[2]/span")).click();

       WebElement eleDress= driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
        System.out.println(eleDress.getText());
        WebElement searchBar=driver.findElement(By.id("search_query_top"));
        //actions.moveToElement(eleDress).doubleClick().build().perform();

        //driver.findElement(By.xpath("//*[@id='center_column']/div/div/div[3]/h1")).sendKeys(Keys.chord(Keys.CONTROL, "c"));

        String dressCopy=eleDress.getText();
        driver.findElement(By.id("search_query_top")).sendKeys(dressCopy);
        driver.findElement(By.name("submit_search")).click();
        WebElement addedDressElement=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a"));
        System.out.println("Added Dress Element : "+addedDressElement.getText());

        String findDressElement=addedDressElement.getText();

        Assert.assertEquals(findDressElement,dressCopy);
        //Done


    }
}
