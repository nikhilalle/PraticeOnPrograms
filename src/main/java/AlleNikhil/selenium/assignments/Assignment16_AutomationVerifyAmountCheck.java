package AlleNikhil.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment16_AutomationVerifyAmountCheck {
    /**
     * Scenario: Verify that Total Price is reflecting correctly if the user changes quantity on 'Shopping Cart Summary' Page.
     * Steps to Automate:
     * 1. Open link http://automationpractice.com/index.php
     * 2. Login to the website.
     * 3. Move your cursor over the Dresses link.
     * 4. Click on the sub menu ‘Summer Dresses’.
     * 5. Mouse hover on the second product(Printed Summer Dresses) displayed.
     * 6. More' button will be displayed, click on the 'More' button.
     * 7. Make sure the quantity is set to 1.
     * 8. Select size 'M'
     * 9. Select the color of your choice.
     * 10. Click the 'Add to Cart' button.
     * 11. Click the 'Proceed to checkout' button.
     * 12. Change the quantity to 2.
     * 13. Verify that Total price is changing and reflecting the correct price.
     **/
    @Test
    public void verfityCart() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email")).sendKeys("nik@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("12099345");
        driver.findElement(By.id("SubmitLogin")).click();

        Actions actions = new Actions(driver);

        WebElement dresses = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]/a"));

        actions.moveToElement(dresses).build().perform();
        driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")).click();
        WebElement pageOpenCheck = driver.findElement(By.xpath("//h1[@class='page-heading product-listing']/span[1]"));
        System.out.println("Page Open in Title is : " + pageOpenCheck.getText());

        String pageName = pageOpenCheck.getText();
        System.out.println(pageName);
        WebElement summerElement = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]/div/div[2]/h5/a"));
        actions.moveToElement(summerElement).build().perform();
        System.out.println(summerElement.getText());
        driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[2]/span")).click();
        WebElement productQuantity = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']/input"));
        System.out.println("product Quantity  : " + productQuantity);
        driver.findElement(By.xpath("//div[@class='attribute_list']/div/select/option[2]")).click();

        driver.findElement(By.xpath("//ul[@id='color_to_pick_list']/li[2]/a")).click();

        driver.findElement(By.id("add_to_cart")).click();
        Thread.sleep(3000);
        WebElement addProuct = driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a"));
        Thread.sleep(1000);
        //  actions.moveToElement(addProuct).click();
        addProuct.click();
        WebElement cartAddCheck = driver.findElement(By.xpath("//a[text()='Printed Summer Dress']"));

        //WebElement cartAddCheck1=driver.findElement(By.xpath("//*[@id='layer_cart]/div[1]/div[2]/div[4]/a"));
        //  cartAddCheck1.click();
        System.out.println(cartAddCheck.getText());


        driver.findElement(By.xpath("//td[@class='cart_quantity text-center']/div/a[@title='Add']")).click();
        WebElement unitOneAmount=driver.findElement(By.xpath("//td[@class='cart_unit']/span/span"));

        System.out.println("One pices  Amount: "+unitOneAmount.getText());

        WebElement totalAmount = driver.findElement(By.xpath("//td[@class='cart_total']/span"));
        System.out.println("Total  Amount : " + totalAmount.getText());
        ;
        WebElement amountWithOutGst = driver.findElement(By.xpath("//tr[@class='cart_total_price']/td[3]"));
        System.out.println("Amount Without Gst : " + amountWithOutGst.getText());

        String cartAmount = totalAmount.getText();
        String addedAmount = amountWithOutGst.getText();

        Assert.assertEquals(cartAmount, addedAmount);

        //Done


    }
}
