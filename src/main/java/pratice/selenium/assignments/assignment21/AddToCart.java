package pratice.selenium.assignments.assignment21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart extends ActionPage{
    WebDriver driver;
    AddToCart(WebDriver driver){
        this.driver=driver;

    }
    By  mouseHover=By.xpath("//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[3]/div");
    By selectSize= By.xpath("//*[@data-product-id='158']/following-sibling::div/div/div/div[3]");
    By colour=By.xpath("//*[@data-product-id='158']/following-sibling::div/div/following-sibling::div/div/div[1]");

    By crt=By.xpath("//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[3]/div/div[1]/form/button");
    By clickMouse=By.xpath("//div[@role='alert']/div/div/a");
    By productAmount= By.xpath("//span[@class='cart-price']/span[1]");
    //By cartAmount= By.xpath(" //*[@id='cart-totals']/div/table/tbody/tr[3]/td/strong/span");
    By checkOut=By.xpath("//*[@id='maincontent']/div[3]/div/div[2]/div[1]/ul/li[1]/button/span");
  //  By clickBtn=By.id("top-cart-btn-checkout");

    public void cartAdd(){
        mouseHover(driver,mouseHover);
        btnClick(driver,selectSize);
        btnClick(driver,colour);

        mouseActions(driver,crt);
        mouseActions(driver,clickMouse);
      String productAmountasperexpt=  getText(driver,productAmount);
        //String productAmountaspercart=  getText(driver,cartAmount);
        //System.out.println(productAmountaspercart);
        System.out.println(productAmountasperexpt);
        //Assert.assertEquals(productAmountaspercart,productAmountasperexpt);
        mouseActions(driver,checkOut);

    }
}
