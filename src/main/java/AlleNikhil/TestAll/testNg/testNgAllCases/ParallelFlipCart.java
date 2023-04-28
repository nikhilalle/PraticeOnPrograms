package AlleNikhil.TestAll.testNg.testNgAllCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelFlipCart { @Test
public void flipCart() {
    System.out.println("Login Thread ID: " + Thread.currentThread().getId());
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.flipkart.com/");
}
}
