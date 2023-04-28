package AlleNikhil.selenium.titleCheckPrograms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestDriver {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://twitter.com");
        String originalTitle = driver.getTitle();
        System.out.println(originalTitle);

        String execptedTitle = "Twitter";
        Assert.assertEquals(execptedTitle, originalTitle);

        driver.close();
    }
}