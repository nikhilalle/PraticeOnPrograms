package pratice.selenium.projectObjectModelBase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage {
    private final WebDriver driver;
    By email=By.id("email");
    By orderID=By.id("id_order");
    By txtMessage=By.id("message");
    By btnClick=By.id("submitMessage");
    By pageLoginIn=By.xpath("//a[@title='Contact Us']");
    By idCheck=By.id("id_contact");

    public LoginPage(WebDriver driver){
        this.driver=driver;

    }

    public void loginContactUs(WebDriver driver){

        driver.findElement(pageLoginIn).click();

        WebElement selectList=driver.findElement(idCheck);

        Select select=new Select(selectList);
// Select here ie :- Customer service
        select.selectByVisibleText("Customer service");


    }
    public void signIn(String mail,String idNo,String succesTxt){

        driver.findElement(email).sendKeys(mail);
       //driverPage(email,mail);
        driver.findElement(orderID).sendKeys(idNo);
        //driverPage(orderID,idNo);
        driver.findElement(txtMessage).sendKeys(succesTxt);
        driver.findElement(btnClick).click();

        String successMessage=driver.findElement(By.xpath("//p[text()='Your message has been successfully sent to our team.']")).getText();
        System.out.println(successMessage);
        String actualMessage="Your message has been successfully sent to our team.";
        Assert.assertEquals(successMessage,actualMessage);

    }/**
    public void driverPage(By locator,By value){
        driver.findElement(locator).sendKeys("value");
 **/

    }

