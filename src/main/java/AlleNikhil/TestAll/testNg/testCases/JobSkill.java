package AlleNikhil.TestAll.testNg.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JobSkill {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://jobnskills.com/signin-signup/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.name("pt_user_fname"));
        userName.sendKeys("Nikhil");
        WebElement lastName=driver.findElement(By.name("pt_user_lname"));
        lastName.sendKeys("Alle");
        WebElement userName1=driver.findElement(By.xpath("//input[@class='form-control input-lg jobsearch-regrequire-field' and @name='pt_user_login']"));
        userName1.sendKeys("allenikhil");

        WebElement email=driver.findElement(By.xpath("//input[@class='form-control input-lg jobsearch-regrequire-field' and @name='pt_user_email']"));
 email.sendKeys("allenikhl12e@gmail.com");
        WebElement mobNo=driver.findElement(By.xpath("//div[@class='selected-flag' and @role='combobox']"));
        mobNo.sendKeys("8790348488");
        Select dropDown=new Select(driver.findElement(By.className("selectize-dropdown single selectize-select plugin-remove_button")));
        dropDown.selectByVisibleText("Yes");
    }
}
