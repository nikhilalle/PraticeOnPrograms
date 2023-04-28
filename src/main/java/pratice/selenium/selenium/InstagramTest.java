package pratice.selenium.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class InstagramTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com");

        String originalTitle=driver.getTitle();
        System.out.println(originalTitle);

        String clientTitle="Instagram";
        System.out.println(clientTitle);
        Assert.assertEquals(clientTitle,originalTitle);
        driver.close();
    }
}
