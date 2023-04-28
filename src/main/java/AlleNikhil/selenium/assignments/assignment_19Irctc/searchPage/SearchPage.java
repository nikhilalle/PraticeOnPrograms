package AlleNikhil.selenium.assignments.assignment_19Irctc.searchPage;

import com.matrix.AlleNikhil.selenium.assignments.assignment_19Irctc.actionPage.ActionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SearchPage extends ActionPage {
    private final WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver=driver;
    }

    public void searchTrains() {
        By btnOk=By.xpath("//app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
        By source=By.xpath("//*[@id='origin']/span/input");
        By destination=By.xpath("//*[@id='destination']/span/input");
        By generalQuota=By.xpath("//*[@id='journeyQuota']/div/div[4]/div/ul/p");
        By allSeat=By.xpath("//*[@id='journeyClass']/div/div[2]/span");
        // By seat2Seating=By.xpath("//*[@id='journeyClass']/div/div[4]/div/ul/p-dropdownitem[14]/li");
        By clickBtn=By.xpath("//*[@id='divMain']/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button");
        By trainList=By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']");

        Actions action=new Actions(driver);
clickOnBtn(driver,btnOk);

        driver.findElement(source).sendKeys("SOLAPUR JN - SUR");

        driver.findElement(destination).sendKeys("PUNE JN - PUNE");
        WebElement allSeats=driver.findElement(allSeat);

        action.moveToElement(allSeats).doubleClick().build().perform();

        driver.findElement(clickBtn).click();

        List<WebElement> listTrain= driver.findElements(trainList);
        for (WebElement list:listTrain) {
            System.out.println(list.getText());
    }
}
}

