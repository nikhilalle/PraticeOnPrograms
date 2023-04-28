package pratice.selenium.assignments.assignment21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public abstract class ActionPage {
  private   WebDriver driver;

   public ActionPage(){
   }
    public void type(WebDriver driver,By locator,String value){
        driver.findElement(locator).sendKeys(value);
    }
    public void btnClick(WebDriver driver,By locator){
        driver.findElement(locator).click();
    }
    public void locator(WebDriver driver,By locator){
        driver.findElement(locator);
    }
    public String getText(WebDriver driver, By locator) {
        return driver.findElement(locator).getText();
    }
    public void mouseActions(WebDriver driver, By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).click().build().perform();

    }
    public void mouseHover(WebDriver driver, By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).build().perform();

    }


    public List<WebElement> getElements(WebDriver driver, By locator) {
        return driver.findElements(locator);
    }

    public void selectElement(WebDriver driver, By location, String value) {
        Select select = new Select(driver.findElement(location));
        select.selectByValue(value);
    }

    public WebElement getElement(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }
}
