package selenium.waitsConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AllWaits {
    WebDriver driver;
    WebDriverWait webDriverWait;
    FluentWait<WebDriver> fluentWait;

    @Test
    public void waitsConcept(){
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);

        driver.manage().timeouts().implicitlyWait(13,TimeUnit.MINUTES);

        driver.manage().timeouts().implicitlyWait(13,TimeUnit.MINUTES);

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(hidfdcbiud))
//        WebDriverWait.until(ExpectedConditions.elementToBeClickable())
//        webDriverWait.until(ExpectedConditions.elementToBeClickable());
//        webDriverWait.until(ExpectedConditions.elementToBeClickable());
//        driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS)
        webDriverWait.until(ExpectedConditions.titleIs("sauce demo "));
        fluentWait.withTimeout(Duration.ofMillis(2));

        fluentWait.pollingEvery(Duration.ofMillis(2000));
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);

        webDriverWait.until(ExpectedConditions.titleIs("yag"));
        fluentWait.withTimeout(Duration.ofSeconds(2));
        fluentWait.withTimeout(Duration.ofSeconds(2));
        fluentWait.pollingEvery(Duration.ofSeconds(12));
        fluentWait.pollingEvery(Duration.ofSeconds(12));
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        webDriverWait.until(ExpectedConditions.titleIs("903i"));
        webDriverWait.until(ExpectedConditions.titleIs("34344"));
        fluentWait.withTimeout(Duration.ofSeconds(233));
        fluentWait.pollingEvery(Duration.ofSeconds(23));
        fluentWait.pollingEvery(Duration.ofSeconds(4));
        fluentWait.withTimeout(Duration.ofSeconds(34));
    }
}
