package AlleNikhil.selenium.assignments;

import com.matrix.AlleNikhil.selenium.assignments.assignment_19Irctc.actionPage.ActionPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment19 extends ActionPage {
    By btnOk=By.xpath("//app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
    By source=By.xpath("//*[@id='origin']/span/input");
    By destination=By.xpath("//*[@id='destination']/span/input");
    By generalQuota=By.xpath("//*[@id='journeyQuota']/div/div[4]/div/ul/p");
   By allSeat=By.xpath("//*[@id='journeyClass']/div/div[2]/span");
   // By seat2Seating=By.xpath("//*[@id='journeyClass']/div/div[4]/div/ul/p-dropdownitem[14]/li");
    By clickBtn=By.xpath("//*[@id='divMain']/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button");
    By trainList=By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']");



    @Test
    public void checkDetails(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        Actions action=new Actions(driver);

        driver.findElement(btnOk).click();
        driver.findElement(source).sendKeys("SOLAPUR JN - SUR");

        driver.findElement(destination).sendKeys("PUNE JN - PUNE");
        WebElement allSeats=driver.findElement(allSeat);

        action.moveToElement(allSeats).doubleClick().build().perform();

       // WebElement seats_2=driver.findElement(seat2Seating);
      //  action.moveToElement(seats_2).click().build().perform();
       /** List<WebElement> generalQuotaList= driver.findElements(generalQuota);
        List<WebElement> seatingList= driver.findElements(seat2Seating);

        for (WebElement qouta:generalQuotaList) {
            System.out.println(qouta.getText());
        }
        for (WebElement seat:seatingList) {
            System.out.println(seat.getText());
        }
        **/
        driver.findElement(clickBtn).click();

        List<WebElement> listTrain= driver.findElements(trainList);
        for (WebElement list:listTrain) {
            System.out.println(list.getText());

        }
        }
    }

