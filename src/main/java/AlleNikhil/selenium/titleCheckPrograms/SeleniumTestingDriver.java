package AlleNikhil.selenium.titleCheckPrograms;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumTestingDriver {
    public static void main(String[] args) {

        // 1. Open Chrome browser

        System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");


        ChromeDriver driver =new ChromeDriver();

        // 2. Navigate to https://www.facebook.com/" application

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        // 3. Get the title (Actual Title : Which is coming from Application)

        String actualName=driver.getTitle();

        System.out.println(actualName);
        String execeptedName="Fackbook log in";

        System.out.println(execeptedName);


        // 4. Compare the title with Expected title (This is the expectations of the client) : Fackbook log in

        if(actualName.equals(execeptedName)){
            System.out.println("it is Correct Page");
        }else {
            System.out.println("it is Not Correct Page");
        }
        Assert.assertEquals(execeptedName,actualName);
        driver.close();
    }
}
