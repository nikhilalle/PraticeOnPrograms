package pratice.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment9_DropDownListVerify {
    @Test
    public void login() throws InterruptedException {
        /// WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-07/");
        driver.manage().window().maximize();

        WebElement btnDrpDwn = driver.findElement(By.xpath("//div[@class='label ui selection fluid dropdown multiple']//descendant::i"));
        btnDrpDwn.click();
        Thread.sleep(10000);

        WebElement addFamily = driver.findElement(By.xpath("//div[@class='menu transition visible']//child::div[@data-value='1']"));
        addFamily.click();
        System.out.println(addFamily.getText());
        WebElement addWork = driver.findElement(By.xpath("//div[@class='menu transition visible']//child::div[@data-value='6']"));
        addWork.click();
        System.out.println(addWork.getText());
        WebElement addFriends = driver.findElement(By.xpath("//div[@class='menu transition visible']//child::div[@data-value='3']"));
        addFriends.click();
        System.out.println(addFriends.getText());
        WebElement addStartup = driver.findElement(By.xpath("//div[@class='menu transition visible']//child::div[@data-value='5']"));
        addStartup.click();
        System.out.println(addStartup.getText());

        List<String> exceptedList = new ArrayList<>();
        exceptedList.add("Family");
        exceptedList.add("Work");
        exceptedList.add("Friends");
        exceptedList.add("Startup");
        System.out.println(exceptedList.size());
        for (String element1:exceptedList) {
            System.out.println((element1));
        }

        List<WebElement> elementList=driver.findElements(By.xpath("//div[@class='label ui selection fluid dropdown multiple active visible']//child::a"));
        ArrayList acutalList = new ArrayList();

        for (WebElement element:elementList) {
            System.out.println("__________________");
            System.out.println((element.getText()));
            acutalList.add(element.getText());

        }
        Assert.assertEquals(exceptedList,acutalList);


        }
// done

    }


