package AlleNikhil.selenium.assignments.assignment21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingAddress extends ActionPage{
    WebDriver driver;
    ShippingAddress(WebDriver driver){
        this.driver=driver;

    }
    /**
    By email= By.xpath("//input[@name='username' and @id='customer-email' and  @type='email'][1]");
    By firstname=By.xpath("//input[@class='input-text' and @name='firstname']");
    By surName=By.xpath("//input[@class='input-text' and @name='lastname']");
    By compayName=By.xpath("//input[@class='input-text' and @name='company']");
    By address=By.xpath("//input[@class='input-text' and @name='street[0]']");
    By address2=By.xpath("//input[@class='input-text' and @name='street[1]']");
    By address3=By.xpath("//input[@class='input-text' and @name='street[2]']");
    By city=By.xpath("//input[@class='input-text' and @name='city']");
    By state=By.xpath("//select[@class='select' and @name='region_id']");
    By postalCode=By.xpath("//input[@class='input-text' and @name='postcode']");
    By country=By.xpath("//select[@class='select' and @name='country_id']");
    By phoneNO=By.xpath("//input[@class='input-text' and @name='telephone']");
     **/
     //By email= By.xpath("//div[@class='field required']//input[@type='email']");
    //By email= By.id("customer-email");
     By firstname=By.name("firstname");
     By surName=By.name("lastname");
     By compayName=By.xpath("//input[@class='input-text' and @name='company']");
     By address=By.xpath("//input[@class='input-text' and @name='street[0]']");
     By address2=By.xpath("//input[@class='input-text' and @name='street[1]']");
     By address3=By.xpath("//input[@class='input-text' and @name='street[2]']");
     By city=By.xpath("//input[@class='input-text' and @name='city']");
     By state=By.xpath("//select[@class='select' and @name='region_id']");
     By postalCode=By.xpath("//input[@class='input-text' and @name='postcode']");
     By country=By.xpath("//select[@class='select' and @name='country_id']");
     By phoneNO=By.xpath("//input[@class='input-text' and @name='telephone']");
     By nextBtn=By.xpath("//*[@id='shipping-method-buttons-container']/div/button/span");





    public void shippinLogin() throws InterruptedException {
        Thread.sleep(2000);
      //type(driver, email, "allenikhik@gmail.com");
//        //type(driver,email,"nikhilalle@gmail.com");
  type(driver,firstname,"Nikhilesh");
      type(driver,surName,"Alle");
//        type(driver,compayName,"TCS");
//        type(driver,address,"186 A");
//        type(driver,address2,"Sakhar Peth");
//        type(driver,address3,"Kanna Chowk,Solapur");
//        type(driver,city,"Solapur");
//        selectElement(driver,state,"Maharashtra");
//        type(driver,postalCode,"413005");
//        selectElement(driver,country,"India");
//        type(driver,phoneNO,"9325713537");
        btnClick(driver,nextBtn);



    }
    }

