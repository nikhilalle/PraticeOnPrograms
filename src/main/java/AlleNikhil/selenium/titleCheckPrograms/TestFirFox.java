package AlleNikhil.selenium.titleCheckPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFirFox {
    @Test
    public static void main(String[] args) {

        System.setProperty("webdriver.gesko.driver","D:\\New folder\\geckodriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://twitter.com/");
        String actualTile=driver.getTitle();
        System.out.println(actualTile);
        String expectedTile="Twitter";
        if (actualTile.equals(expectedTile)){
            System.out.println("It is Correct ");
        }else {
            System.out.println("It is Not Correct ");
        }
        //Assert.assertEquals(actualTile,expectedTile);
        driver.close();

    }
}
