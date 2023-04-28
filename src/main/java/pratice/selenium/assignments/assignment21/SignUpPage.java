package pratice.selenium.assignments.assignment21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage  extends ActionPage{
     WebDriver driver;
    By signup= By.xpath("//div/div[@class='panel header']/ul/li/a[1]");
    By emailId=By.id("email");
    By password=By.id("pass");
    By login=By.id("send2");
    By createNewAccountBtn=By.xpath("//div[@class='primary']/a[1]");
    public SignUpPage(WebDriver driver){
        this.driver=driver;
    }
    public void signUpPage(){
        btnClick(driver,signup);
        type(driver,emailId,"nikhilalle@gmail.com");
        type(driver,password,"nikhil#4124");
        btnClick(driver,login);
        btnClick(driver,createNewAccountBtn);
    }
}
