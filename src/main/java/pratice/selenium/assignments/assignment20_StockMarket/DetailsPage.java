package pratice.selenium.assignments.assignment20_StockMarket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class DetailsPage extends ActionPage {

    By selectList=By.xpath("//*[@id='sel-Pre-Open-Market']");
    By allValue=By.xpath("//*[@id='sel-Pre-Open-Market']/option[6]");

    WebDriver driver;
    DetailsPage(WebDriver driver){
        this.driver=driver;
    }
    public void getDetails(){

        List<WebElement> elementList=driver.findElements(selectList);
        for (WebElement listElement:elementList){
            System.out.println(listElement.getText());
        }


        selectElement(driver,selectList,"ALL");

       clickOnElement(driver,allValue);





        }
}
