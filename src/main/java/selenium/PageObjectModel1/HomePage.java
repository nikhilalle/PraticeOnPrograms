package selenium.PageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends ActionClass {
    By userName=By.id("user-name");
    By userPassword=By.id("password");
    By login=By.id("login-button");
    By element1=By.id("add-to-cart-sauce-labs-backpack");
    By element2=By.id("add-to-cart-sauce-labs-bike-light");
    By element3=By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By element4=By.id("add-to-cart-sauce-labs-fleece-jacket");
    By cartClick=By.className("shopping_cart_link");
    By cartCheckOut=By.id("checkout");
    By firstName=By.id("first-name");
    By lastName=By.id("last-name");
    By postalCode=By.id("postal-code");
    By continueClick=By.id("continue");
    By finish=By.id("finish");

WebDriver driver;
HomePage(WebDriver driver){
    this.driver=driver;
}
public void login(){
    type(driver,userName,"standard_user");
    type(driver,userPassword,"secret_sauce");
    clickOnElement(driver,login);

}
public void addToCart(){
   clickOnElement(driver,element1);
    clickOnElement(driver,element2);
    clickOnElement(driver,element3);
    clickOnElement(driver,element4);
    clickOnElement(driver,cartClick);
    clickOnElement(driver,cartCheckOut);
}
public void enterDetails(){
    type(driver,firstName,"Nikhil");
    type(driver,lastName,"Alle");
    type(driver,postalCode,"413005");
    clickOnElement(driver,continueClick);
    clickOnElement(driver,finish);
}
}
