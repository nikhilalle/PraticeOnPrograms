package AlleNikhil.TestAll.testCasesCheck;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCheck {
    @Test
    public void MultiDropDown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-07/");
        driver.manage().window().maximize();

        WebElement btnDrpDwn=driver.findElement(By.xpath("//div[@class='label ui selection fluid dropdown multiple']//descendant::i"));
        btnDrpDwn.click();
        Thread.sleep(10000);

        WebElement drpDwnFamily=driver.findElement(By.xpath("//div[@class='menu transition visible']//child::div[@data-value='1']"));
        drpDwnFamily.click();
        System.out.println(drpDwnFamily.getText());
        WebElement drpDwnWork=driver.findElement(By.xpath("//div[@class='menu transition visible']//child::div[@data-value='6']"));
        drpDwnWork.click();
        System.out.println(drpDwnWork.getText());
        WebElement drpDwnFriends=driver.findElement(By.xpath("//div[@class='menu transition visible']//child::div[@data-value='3']"));
        drpDwnFriends.click();
        System.out.println(drpDwnFriends.getText());

        List<WebElement> selectedList = (List<WebElement>) driver.findElement(By.xpath("//div[@class='label ui selection fluid dropdown multiple']//descendant::a[@class='ui label transition visible']"));
        System.out.println("--- Using Iterator ---");
        ArrayList expectedTopics = new ArrayList();
        for(WebElement element : selectedList) {
            expectedTopics.add(element.getText());
        }

        List<String> actualTopics = new ArrayList();
        actualTopics.add("Family");
        actualTopics.add("Friends");
        actualTopics.add("Work");
        System.out.println("Actual List:"+actualTopics);

        Assert.assertEquals(actualTopics, expectedTopics);




    }

}
