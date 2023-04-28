package IrctcIndianRail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageActions {

    public void type(WebDriver driver, By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }
    public void clickOnElement(WebDriver driver, By locator){
        driver.findElement(locator).click();
    }
    public String getElementText(WebDriver driver, By locator){
        return driver.findElement(locator).getText();
    }

}
