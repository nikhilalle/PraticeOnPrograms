package AlleNikhil.selenium.assignments.assignment20_StockMarket;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver initBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.nseindia.com/market-data/pre-open-market-cm-and-emerge-market");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }
}
