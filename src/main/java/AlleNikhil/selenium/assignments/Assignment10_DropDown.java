package AlleNikhil.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment10_DropDown {
    @Test
    public void verifyDropDown() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-04/");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        WebElement toronto = driver.findElement(By.xpath("//span[text()='Toronto']"));
        toronto.click();

        WebElement bucharest = driver.findElement(By.xpath("//span[text()='Bucharest']"));
        bucharest.click();

        WebElement paris = driver.findElement(By.xpath("//span[text()='Paris']"));
        paris.click();

        List<WebElement> dropDownList=driver.findElements(By.xpath("//select[@class='selectpicker']//option"));

        List<String> expectedTopics = new ArrayList<>();

        for (WebElement element:dropDownList) {
            System.out.println(element.getText());
            expectedTopics.add(element.getText());
        }


        System.out.println("------------------Actual List--------");
        List<String> actualList = new ArrayList();
        actualList.add("Toronto");
        actualList.add("Bucharest");
        actualList.add("Paris");
        System.out.println(actualList);

        Assert.assertEquals(expectedTopics,actualList);
// done

    }
}
