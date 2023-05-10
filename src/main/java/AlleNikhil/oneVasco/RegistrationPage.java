package AlleNikhil.oneVasco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RegistrationPage extends ActionPage {
    WebDriver driver;

    By signIn = By.xpath("//button[contains(text(),' Sign In / Sign Up')]");
    By registration = By.xpath("//a[contains(text(),'Register Here')]");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By emailId = By.id("email");
    By mobileNumber = By.id("phoneNumber");
    By password = By.id("passField");
    By confirmPassword = By.id("confirmpassField");
    By address1 = By.xpath("//label[contains(text(),'Address 1') and @for='lastName']");
    By address2 = By.xpath("//label[contains(text(),'Address 2') and @for='lastName']");
    By state = By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//div//div//span");
    By country = By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//div//div//span");
    By city = By.xpath("//label[contains(text(),'City')]");

    By pincode = By.xpath("//label[contains(text(),'Pincode')]");
    By tearms_And_Conditions = By.id("privacyNotice");

    By RegisterBtn = By.xpath(" //button[contains(text(),'Register')]");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userRegistration() throws InterruptedException {

        clickOnElement(driver, signIn);
        driver.findElement(registration).click();
        //clickOnElement(driver, registration);
        type(driver, firstName, "Parag");
        type(driver, lastName, "Shaha");
        type(driver, emailId, "nikhileshalle18");
        type(driver, mobileNumber, "7989234367");
        type(driver, password, "Paragshaha@12");
        type(driver, confirmPassword, "Paragshaha@12");

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(address1)).click().build().perform();
//clickOnElement(driver,address1);

//        WebDriverWait wait2 = new WebDriverWait(driver,  30);
//        wait2.until(ExpectedConditions.visibilityOf(driver.findElement(address1)));

Thread.sleep(3000);
        type(driver, address1, "123,Golden Park");
        type(driver, address2, "East Mumbai");
        type(driver, city, "Mumbai");
//JavascriptExecutor js=(JavascriptExecutor)driver;
//      js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        List<WebElement> stateList=driver.findElements(country);
        for(WebElement list:stateList){
            System.out.println(list.getText());

        }



    }

}
