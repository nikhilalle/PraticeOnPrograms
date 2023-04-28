package pratice.selenium.titleCheckPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
    public static void main(String[] args) {
       /**  Scenario 1:
         1. Open Chrome browser
         2. Navigate to https:https://www.facebook.com/ application
         3. Get the title (Actual Title : Which is coming from Application)
         4. Compare the title with Expected title (This is the expectations of the client) : FackBook Log in
*/

       System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String actualTitle=driver.getTitle();
        String exceptedTitle="FaceBook";
        System.out.println("Actual Title :" +actualTitle);

        System.out.println("Excepted Title "+exceptedTitle);
        if (actualTitle.equals(exceptedTitle)){
            System.out.println("ExceptedTitle is Correct");
        }else {
            System.out.println("ExceptedTitle is NOT Correct");
        }








    }
}
