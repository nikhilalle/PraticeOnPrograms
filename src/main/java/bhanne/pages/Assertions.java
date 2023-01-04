package bhanne.pages;

import bhanne.base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions extends BaseClass {
    WebDriver driver;
    By top = By.xpath("//span[@class=''and text()='tops']");
    By bottoms = By.xpath("//span[@class=''and text()='bottoms']");
    By dresses = By.xpath("//span[@class=''and text()='dresses']");
    By others = By.xpath("//span[@class=''and text()='others']");
    By markdown = By.xpath("//span[@class=''and text()='markdown']");
    By zine = By.xpath("//span[@class=''and text()='zine']");

    By store =By.xpath("//a[@class='slide-link'and text()='store']");
    By contact=By.xpath("//a[@class='slide-link'and text()='contact']");
    By subscribe =By.xpath("//a[@class='slide-link'and text()='subscribe']");
    By exchanges =By.xpath("//a[@target='_blank' and text()='exchanges']");
    By shipping=By.xpath("//a[@target='_blank' and text()='shipping']");
    By terms=By.xpath("//a[@target='_blank' and text()='exchanges']");


    public Assertions(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void verifyTitle() {
        String actualTitle = driver.getTitle();
        System.out.println("Actual Tilte :" + actualTitle);
        //String expectedTitle = "bhaane";
        Assert.assertEquals("Bhaane is a contemporary clothing company for conscious urban millennial.", actualTitle);
        WebElement elementTop = driver.findElement(top);
        System.out.println(elementTop.getText());

        WebElement elementBottoms = driver.findElement(bottoms);
        System.out.println(elementBottoms.getText());

        WebElement elementDresses = driver.findElement(dresses);
        System.out.println(elementDresses.getText());

        WebElement elementOthers = driver.findElement(others);
        System.out.println(elementOthers.getText());

        WebElement elementMarkdown = driver.findElement(markdown);
        System.out.println(elementMarkdown.getText());

        WebElement elementZine = driver.findElement(zine);
        System.out.println(elementZine.getText());

        WebElement elementStore = driver.findElement(store);
        System.out.println(elementStore.getText());

        WebElement elementContact = driver.findElement(contact);
        System.out.println(elementContact.getText());

        WebElement elementSubscribe = driver.findElement(subscribe);
        System.out.println(elementSubscribe.getText());

        WebElement elementExchanges = driver.findElement(exchanges);
        System.out.println(elementExchanges.getText());

        WebElement elementShipping = driver.findElement(shipping);
        System.out.println(elementShipping.getText());

        WebElement elementTerms = driver.findElement(terms);
        System.out.println(elementTerms.getText());


    }


}
