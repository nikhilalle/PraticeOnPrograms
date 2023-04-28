package AlleNikhil.selenium.selenium10.seleniumCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestActionPerform {

    WebDriver driver;
    Alert alert;
    Actions action;

    @BeforeMethod
    public void inti() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
    }

    @Test
    public void rightClick() {
        action = new Actions(driver);
        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        action.contextClick(rightClick).build().perform();
        WebElement editElement = driver.findElement(By.xpath("//*[text()='Edit']"));
        action.moveToElement(editElement).click().build().perform();
        alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void doubleClick() {
        action = new Actions(driver);
        WebElement doubleClick = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
        action.doubleClick(doubleClick).build().perform();
        alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        action = new Actions(driver);
        WebElement capitalCityCopenhagen = driver.findElement(By.xpath("//div[@id='box4' and  text()='Copenhagen']"));
        WebElement capitalCitySeoul = driver.findElement(By.xpath("//div[@id='box5' and  text()='Seoul']"));
        WebElement capitalCityWashington = driver.findElement(By.xpath("//div[@id='box3' and  text()='Washington']"));
        WebElement capitalCityStockholm = driver.findElement(By.xpath("//div[@id='box2' and  text()='Stockholm']"));
        WebElement capitalCityOslo = driver.findElement(By.xpath("//div[@id='box1' and  text()='Oslo']"));

        WebElement countyCityCopenhagen = driver.findElement(By.xpath("//div[@id='box104' and  text()='Denmark']"));
        WebElement countyCitySeoul = driver.findElement(By.xpath("//div[@id='box105' and  text()='South Korea']"));
        WebElement countyCityWashington = driver.findElement(By.xpath("//div[@id='box103' and  text()='United States']"));
        WebElement countyCityStockholm = driver.findElement(By.xpath("//div[@id='box102' and  text()='Sweden']"));
        WebElement countyCityOslo = driver.findElement(By.xpath("//div[@id='box101' and  text()='Norway']"));


       // action.dragAndDrop(capitalCityCopenhagen, countyCityCopenhagen).build().perform();
        action.dragAndDrop(capitalCitySeoul, countyCitySeoul).build().perform();
        action.dragAndDrop(capitalCityWashington, countyCityWashington).build().perform();
        action.dragAndDrop(capitalCityStockholm, countyCityStockholm).build().perform();
        action.dragAndDrop(capitalCityOslo, countyCityOslo).build().perform();
        action.dragAndDrop(capitalCityCopenhagen,capitalCityCopenhagen);
//        action.clickAndHold(capitalCityCopenhagen).moveToElement(countyCityCopenhagen).release().build().perform();
//        action.clickAndHold(capitalCitySeoul).moveToElement(countyCitySeoul).release().build().perform();
//        action.clickAndHold(capitalCityWashington).moveToElement(countyCityWashington).release().build().perform();
//        action.clickAndHold(capitalCityStockholm).moveToElement(countyCityStockholm).release().build().perform();
//        action.clickAndHold(capitalCityOslo).moveToElement(countyCityOslo).release().build().perform();


    }

    @AfterMethod
    public void tearDown() {
        //driver.close();
       // driver.quit();
    }
}
