package noCommarce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterTheApplication extends ActionClass {
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor)driver;

    RegisterTheApplication(WebDriver driver) {
        this.driver = driver;
    }

    By appLogoBtn = By.xpath("//span[contains(text(), 'My account')] ");
    By register = By.xpath("//li//span[text()='Register']");
    By firstname = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By confirmEmail = By.id("ConfirmEmail");
    By userName = By.id("Username");
    By checkAvailabilityButton = By.id("check-availability-button");
    By timeZoneId = By.id("TimeZoneId");
    By countySelect = By.id("CountryId");
    By password = By.id("Password");
    By conformPassword = By.id("ConfirmPassword");
    By detailsCompanyIndustryId = By.id("Details_CompanyIndustryId");
    By optionOnCommerce1 = By.xpath("//select[@data-val-required='The What do you plan to use nopCommerce for? field is required.']");
    By optionOnCommerce2 = By.xpath("//select[@data-val-required='The My main activity in the company is field is required.']");
    By optionOnCommerce3 = By.xpath("//select[@data-val-required='The How many people work for your company? field is required.']");
By companyUrl=By.xpath("//input[@id='Details_CompanyWebsiteUrl']");
By errorMessage=By.xpath("//div[@class='message-error validation-summary-errors']/ul/li");
By userRegister=By.id("register-button");
    public void registration() {
        mouseActions(driver, appLogoBtn);
        mouseActions(driver, register);
        type(driver, firstname, " Nikhilesh");
        type(driver, lastName, "Alle");
        type(driver, email, "nikhileshalle18@gmail.com");
        type(driver, confirmEmail, "nikhileshalle18@gmail.com");
        type(driver, userName, "NikhilAlle");
        mouseActions(driver, checkAvailabilityButton);
        selectElement(driver, countySelect, "India");
        selectElement(driver, timeZoneId, "(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi");
        type(driver, password, "Avanti@8924");
        type(driver, conformPassword, "Avanti@8924");
        selectElement(driver, detailsCompanyIndustryId, "Other");
        selectElement(driver, optionOnCommerce1, "As an example for personal training");
        selectElement(driver, optionOnCommerce2, "Business / sales / marketing");
        selectElement(driver, optionOnCommerce3, "I'm working alone");
        type(driver,companyUrl,"Amazon Tech");
        mouseActions(driver,userRegister);
            }

            public String errorMessageCheck(){
        return  driver.findElement(errorMessage).getText();
            }
}
