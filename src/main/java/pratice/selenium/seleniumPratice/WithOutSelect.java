package pratice.selenium.seleniumPratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class WithOutSelect {
    @Test
    public void selectDropDown(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-04");

        driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select show-tick']")).click();
        List<WebElement> list=driver.findElements(By.xpath("//select[@class='selectpicker']"));
        System.out.println(list.size());

        System.out.println("----- Using Itertor-----------");
        Iterator<WebElement> itr=list.iterator();
        while (itr.hasNext()){
            WebElement element=itr.next();
            System.out.println(element.getText());
        }
        System.out.println("----- Using for Each-----------");
        for (WebElement elements:list) {
            System.out.println(elements.getText());
        }
        System.out.println("----- Using for lOOP-----------");
        for (int i=1;i< list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
