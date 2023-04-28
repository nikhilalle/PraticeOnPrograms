package AlleNikhil.TestAll.testNg.testNgAllCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelAmazon {
    @Test
    public void amazon() {
        System.out.println("Login Thread ID: " + Thread.currentThread().getId());
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=12008664445175388846&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062114&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAjwm8WZBhBUEiwA178UnL9nzSUvmrJGK8FUAbcyN0cHNH43nhY4NfKg2sGhBDjJQSG1PZezXBoCufEQAvD_BwE");
    }
}