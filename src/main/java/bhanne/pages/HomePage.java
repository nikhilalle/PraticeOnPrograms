package bhanne.pages;

import bhanne.action.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends PageActions {
    WebDriver driver;
    By btnAccount = By.xpath("//li[text()='account']");
    By btnCross = By.xpath("//div[@class ='cross_sign md']");

    By txtEmail = By.xpath("//div[@class='grid gutter-md']/div[3]//input");
    By btnSignUp = By.xpath("//div[text()='sign up >']");
    By txtFirstName = By.name("first_name");
    By txtLastName = By.name("last_name");
    By txtMobileNo = By.name("mobile");
    By txtPassword = By.xpath("//div[@class='form-group']//input[@name='password']");
    By btnSubmit = By.xpath("//div[@class='grid gutter mt-xl']/button");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void createAccount(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnCross));
        clickOnElement(driver, btnCross);
       // clickOnElement(driver, btnSignUp);
        clickOnElement(driver,btnAccount);
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSignUp));
        clickOnElement(driver, btnSignUp);

        wait.until(ExpectedConditions.visibilityOfElementLocated(txtFirstName));
        type(driver, txtFirstName,"Nikhil");
        type(driver, txtLastName,"Alle");

        wait.until(ExpectedConditions.visibilityOfElementLocated(txtEmail));
        type(driver, txtEmail,"allenikhilalle@gmail.com");
        type(driver, txtMobileNo,"8790348488");

        wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword));
        type(driver, txtPassword, "Nikhil@1234" );

        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSubmit));
        clickOnElement(driver,btnSubmit);
    }
    }



