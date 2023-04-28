package AlleNikhil.selenium.assignments.assignment_19Irctc.actionPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public abstract class ActionPage {
    public void type(WebDriver driver, By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }
    public void clickOnBtn(WebDriver driver,By locator){
        driver.findElement(locator).click();
        }
        public void mouseAction(WebDriver driver,By locator){
            Actions actions=new Actions(driver);
            actions.moveToElement(driver.findElement(locator)).click().build().perform();
    }
    public String textOnElement(WebDriver driver,By locator){
        String txtElement=driver.findElement(locator).getText();
        System.out.println(txtElement);
        return txtElement;
    }
    public void listOfElement(WebDriver driver, By locator){
        List<WebElement> elementList=driver.findElements(locator);
         }


}
