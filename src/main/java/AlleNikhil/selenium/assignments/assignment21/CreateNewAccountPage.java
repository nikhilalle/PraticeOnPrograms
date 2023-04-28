package AlleNikhil.selenium.assignments.assignment21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewAccountPage extends ActionPage {
    WebDriver driver;
    CreateNewAccountPage(WebDriver driver){
        this.driver=driver;

    }
    By firstName= By.id("firstname");
    By lastName= By.id("lastname");
    By emailAddress= By.id("email_address");
    By password=By.id("password");
    By conformPassword=By.id("password-confirmation");
    By createBtn=By.xpath("//*[@class='primary']/button/span[1]");
    By pageCheck=By.xpath("//nav[@class='navigation']/ul/li[3]/a/span[text()='Men']");

    By menPageClick=By.xpath("//span[text()='Men']");

    public void createAccount(){
        type(driver,firstName,"Nikhilesh");
        type(driver,lastName,"Alle");
        type(driver,emailAddress,"allenikhilalle@gmail.com");
        type(driver,password,"Nik@3452");
        type(driver,conformPassword,"Nik@3452");
       // btnClick(driver,createBtn);
        String page=getText(driver,pageCheck);
        System.out.println(page);
        mouseActions(driver,pageCheck);


    }
}
