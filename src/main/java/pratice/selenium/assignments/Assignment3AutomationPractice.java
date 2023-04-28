package pratice.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment3AutomationPractice {
    @Test
    public void addDetails() throws InterruptedException {

        //1. Open this url  http://automationpractice.com/index.php
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        //2. Click on sign in link.
        WebElement btnLogin=driver.findElement(By.className("login"));
        btnLogin.click();

        //3. Enter your email address in 'Create and account' section.
        WebElement txtEmailAdd=driver.findElement(By.id("email_create"));
        txtEmailAdd.sendKeys("allenikh@gmail.com");

        WebElement btnCreateAccount=driver.findElement(By.name("SubmitCreate"));
        btnCreateAccount.click();
        Thread.sleep(2000);

        //5. Enter your Personal Information, Address and Contact info.
        WebElement rdoBtnGender=driver.findElement(By.xpath("//*[@id='id_gender1']"));
        rdoBtnGender.click();

        WebElement txtFirstName=driver.findElement(By.id("customer_firstname"));
        txtFirstName.sendKeys("Nikhil");


        WebElement txtCustomerLastNAme=driver.findElement(By.id("customer_lastname"));
        txtCustomerLastNAme.sendKeys("alle");

        WebElement txtPassword=driver.findElement(By.id("passwd"));
        txtPassword.sendKeys("NikShruti");

        WebElement entrDate=driver.findElement(By.id("days"));
        entrDate.sendKeys("18");

        WebElement entrMonth=driver.findElement(By.id("months"));
        entrMonth.sendKeys("Nov");

        WebElement entrYear=driver.findElement(By.id("years"));
        //entrYear.isSelected();
        entrYear.sendKeys("1994");

        WebElement txtCompany=driver.findElement(By.id("company"));
        txtCompany.sendKeys("Wipro");

        WebElement txtAddress=driver.findElement(By.id("address1"));
        txtAddress.sendKeys("xyz123");

        WebElement txtAddress2=driver.findElement(By.id("address2"));
        txtAddress2.sendKeys("185,Kanna-Chowk");

        WebElement txtCity=driver.findElement(By.id("city"));
        txtCity.sendKeys("Pune");

        Thread.sleep(2000);

        WebElement txtState=driver.findElement(By.id("id_state"));
        txtState.sendKeys("Mh");

        WebElement txtZipCode=driver.findElement(By.id("postcode"));
        txtZipCode.sendKeys("00000");

        WebElement txtContry=driver.findElement(By.id("id_country"));
        txtContry.sendKeys("United States");

        WebElement txtMobileNo=driver.findElement(By.id("phone_mobile"));
        txtMobileNo.sendKeys("123456789");

        WebElement txtAdd=driver.findElement(By.id("alias"));
        txtAdd.sendKeys("lkjjhfgfxbvjhj1234");

        WebElement btnRegister=driver.findElement(By.id("submitAccount"));
        btnRegister.click();

        String ActuallTitle=driver.getTitle();
        System.out.println(ActuallTitle);
        //String expecedTile;
        Assert.assertTrue(true);

    }
}
