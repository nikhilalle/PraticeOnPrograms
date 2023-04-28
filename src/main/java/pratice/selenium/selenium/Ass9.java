package pratice.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.openqa.selenium.By.xpath;

public class Ass9 {
    @Test
    public void verifying() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-07/");
        //List<WebElement> listOfTopics= driver.findElements(By.xpath("//div[@class='menu']"));
        List<WebElement> elements = driver.findElements(By.xpath("//a"));

        List<String> actualTopics = new ArrayList();
        actualTopics.add("Family");
        actualTopics.add("Friends");
        actualTopics.add("Work");

        List<String> expectedTopics = new ArrayList(elements);
        expectedTopics.add("Family");

        for(WebElement element : elements) {
            expectedTopics.add(element.getText());
        }
        Assert.assertEquals(actualTopics, expectedTopics);

    }
}
