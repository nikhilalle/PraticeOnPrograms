package selenium.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public  class ActionClass {
    public void type( WebDriver driver, By locators, String value){
        driver.findElement(locators).sendKeys(value);
    }
    public void clickOnElement(WebDriver driver, By locators){
        driver.findElement(locators).click();
    }
    public  List<WebElement> listOfWebElement(WebDriver driver, By locators){
        List<WebElement> list=driver.findElements(locators);
        return list;
    }
    public void getText(WebDriver driver,By locators){
        driver.findElement(locators).getText();
    }
    public void selectElement(WebDriver driver,By locators,String value){

        Select select=new Select(driver.findElement(locators));
        select.selectByVisibleText(value);
        select.selectByValue(value);
    }
    public void mouseActions(WebDriver driver,By locator,String value){
        Actions actions=new Actions(driver);
        actions.click(driver.findElement(locator)).build().perform();
        actions.contextClick(driver.findElement(locator)).build().perform();
        actions.doubleClick(driver.findElement(locator)).build().perform();
        actions.moveToElement(driver.findElement(locator)).click().build().perform();

    }



}
