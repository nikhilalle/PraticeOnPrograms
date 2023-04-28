package noCommarce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTheApplication extends ActionClass {
    WebDriver driver;

    LoginTheApplication(WebDriver driver) {
        this.driver = driver;
    }
    By userName=By.id("Username");
    By userPassword=By.id("Password");

    By appLogoBtn = By.xpath("//span[contains(text(), 'My account')] ");
    By login = By.xpath("//li//span[text()='Log in']");
    By loginBtn=By.xpath("//div[@class='buttons']/input[@class='btn blue-button'  and  @value='Log in']");
public void login(){
    mouseActions(driver, appLogoBtn);
    mouseActions(driver, login);
    type(driver,userName,"NikhilAlle");
    type(driver,userPassword,"Avanti@8924");
    clickOnElement(driver,loginBtn);
}


}
