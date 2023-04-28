package pratice.selenium.titleCheckPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowsMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com");
        driver.manage().window().maximize();

        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);

        String execeptedTitle="Instagram";


        if(actualTitle.equals(execeptedTitle)){
            System.out.println("Correct");
        }else {
            System.out.println("Not Correct");
        }
    }
}
