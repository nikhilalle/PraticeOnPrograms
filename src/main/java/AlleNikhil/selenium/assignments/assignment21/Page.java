package AlleNikhil.selenium.assignments.assignment21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Page extends ActionPage{
    WebDriver driver;

    Page(WebDriver driver) {
        this.driver = driver;
    }
    By txtAddress = By.name("street[0]");
    By txtCity = By.name("city");
    By ddlState = By.name("region_id");
    By zipCode = By.name("postcode");
    By phnNumber = By.name("telephone");
    By rdoRate = By.name("ko_unique_3");
    By btnSubmit = By.xpath("//span[text()='Next']");
    By finalPrice = By.xpath("//td[@data-th='Order Total']//child::span");
    By btnPlaceOrder = By.xpath("//span[text()='Place Order']/..");
    @Test
    public void PageFill() throws InterruptedException {
        Thread.sleep(2000);
        //type(driver, txtAddress, "186 A");
        Thread.sleep(2000);
        type(driver, txtCity, "texas");
        selectElement(driver, ddlState, "14");
        type(driver, zipCode, "67876-5656");
        type(driver, phnNumber, "9876546789");
        btnClick(driver, rdoRate);
        btnClick(driver, btnSubmit);


    }
}



