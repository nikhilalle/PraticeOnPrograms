package AlleNikhil.selenium.selenium.eventMouse_Keybord;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropMouse {
    @Test
    public void putDragAndDrop() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        WebElement sourceElement1=driver.findElement(By.xpath("//div[@id='box3' and text()='Washington']"));
        WebElement destinationElement1=driver.findElement(By.xpath("//div[@id='box103' and text()='United States']"));

        WebElement sourceElement2=driver.findElement(By.xpath("//div[@id='box5' and text()='Seoul']"));
        WebElement destinationElement2=driver.findElement(By.xpath("//div[@id='box105' and text()='South Korea']"));

        WebElement sourceElement3=driver.findElement(By.xpath("//div[@id='box2' and text()='Stockholm']"));
        WebElement destinationElement3=driver.findElement(By.xpath("//div[@id='box102' and text()='Sweden']"));

        WebElement sourceElement4=driver.findElement(By.xpath("//div[@id='box104' and text()='Denmark']"));
        WebElement destinationElement4=driver.findElement(By.xpath("//div[@id='box4' and text()='Copenhagen']"));

        WebElement sourceElement5=driver.findElement(By.xpath("//div[@id='box6' and text()='Rome']"));
        WebElement destinationElement5=driver.findElement(By.xpath("//div[@id='box106' and text()='Italy']"));


        Actions action=new Actions(driver);
        //  action.dragAndDrop(sourceElement1,destinationElement1).build().perform();

        //  action.dragAndDrop(sourceElement2,destinationElement2).build().perform();
        Thread.sleep(5000);

        action.clickAndHold(sourceElement1).moveToElement(destinationElement1).release().build().perform();

        action.clickAndHold(sourceElement2).moveToElement(destinationElement2).release().build().perform();

        action.clickAndHold(sourceElement3).moveToElement(destinationElement3).release().build().perform();

        action.clickAndHold(sourceElement4).moveToElement(destinationElement4).release().build().perform();

        action.clickAndHold(sourceElement5).moveToElement(destinationElement5).release().build().perform();


    }
}
