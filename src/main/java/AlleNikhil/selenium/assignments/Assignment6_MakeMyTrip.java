package AlleNikhil.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.List;

public class Assignment6_MakeMyTrip {
    @Test
    public void detail(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
/*
        LinkedHashMap<String,Integer> data=new LinkedHashMap<>();
        data.put("Product Offering",0);
        data.put("MakeMyTrip",1);
        data.put("About the Site",2);
        data.put("Quick Links",3);
        data.put("Important Links",4);

 */
        String items = "Product Offering";

       List<WebElement> listdata=driver.findElements(By.xpath("//p[text()='"+items+"']"));
        //  PRODUCT OFFERING
        Iterator<WebElement> itr = listdata.iterator();
        while (itr.hasNext()) {
            WebElement element = itr.next();
            System.out.println(element.getText());
        }


        List<WebElement> ProductItems = driver.findElements(By.xpath("//ul[@class='footNav__list'][1]/child::li"));

        System.out.println("Total Products Count : " +ProductItems.size());

        System.out.println("--- Using Iterator ---");

        Iterator<WebElement> itr1 = ProductItems.iterator();
        while(itr1.hasNext()) {
            WebElement element = itr1.next();
            System.out.println(element.getText());
        }

    }

}
