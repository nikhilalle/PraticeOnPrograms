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
    By markdown = By.xpath("//span[@class='mr-xxs'and text()='markdown']");
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
        String bottom=elementBottoms.getText();
        Assert.assertEquals(bottom,"bottoms");

        WebElement elementDresses = driver.findElement(dresses);
        String dresse=elementDresses.getText();
        Assert.assertEquals(dresse,"dresses");

        WebElement elementOthers = driver.findElement(others);
        String other=elementOthers.getText();
        Assert.assertEquals(other,"others");

        WebElement elementMarkdown = driver.findElement(markdown);
        String markdowns=elementMarkdown.getText();
        Assert.assertEquals(markdowns," ");

        WebElement elementZine = driver.findElement(zine);
        String zines=elementZine.getText();
        Assert.assertEquals(zines,"zine");


        WebElement elementStore = driver.findElement(store);
        String stores=elementStore.getText();
        Assert.assertEquals(stores,"store");

        WebElement elementContact = driver.findElement(contact);
        String contacts=elementContact.getText();
        Assert.assertEquals(contacts,"contact");


        WebElement elementSubscribe = driver.findElement(subscribe);
        String subscribes=elementSubscribe.getText();
        Assert.assertEquals(subscribes,"subscribe");


        WebElement elementExchanges = driver.findElement(exchanges);
        String exchange=elementExchanges.getText();
        Assert.assertEquals(exchange,"exchanges");


        WebElement elementShipping = driver.findElement(shipping);
        String shippings=elementShipping.getText();
        Assert.assertEquals(shippings,"Shipping");

        WebElement elementTerms = driver.findElement(terms);
        String term=elementTerms.getText();
        Assert.assertEquals(term,"Terms");


    }


}
