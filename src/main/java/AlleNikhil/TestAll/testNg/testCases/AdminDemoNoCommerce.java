package AlleNikhil.TestAll.testNg.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdminDemoNoCommerce {
    @Test
    public void newDemo() {
        System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("Email"));
        userName.clear();

        userName.sendKeys("admin@yourstore.com");

        WebElement userPassword = driver.findElement(By.name("Password"));
        userPassword.clear();
        userPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();
        //btnLogin.click();


        WebElement custm = driver.findElement(By.xpath("//i[@class='nav-icon far fa-user']"));
        custm.click();
        WebElement clickcust = driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']"));
        clickcust.click();
        WebElement addNewUser = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        addNewUser.click();

        WebElement newUserAdd = driver.findElement(By.id("Email"));
        newUserAdd.sendKeys("nikhilalle@gmail.com");

        WebElement newUserPass = driver.findElement(By.id("Password"));
        newUserPass.sendKeys("Nikhil@Shruti");

        WebElement newUserFirstName = driver.findElement(By.xpath("//input[@id='FirstName' and @name='FirstName']"));
        newUserFirstName.sendKeys("Nikhilesh");

        WebElement newUserLastName = driver.findElement(By.xpath("//input[@id='LastName' and @type='text']"));
        newUserLastName.sendKeys("Alle");

        WebElement genderSelect = driver.findElement(By.xpath("//input[@id='Gender_Male' and @name='Gender']"));
        genderSelect.click();

        WebElement dathOfBirth = driver.findElement(By.xpath("//input[@id='DateOfBirth' and @name='DateOfBirth']"));
        dathOfBirth.sendKeys("18/11/1994");
        dathOfBirth.getRect();

        //  WebElement companyName1=driver.findElement(By.xpath("//div[@data-original-title='The company name.' and @class='ico-help']"));
        // companyName1.sendKeys("Vi");

        WebElement newsLetter = driver.findElement(By.xpath("//ul[@class='k-reset' and @id='SelectedNewsletterSubscriptionStoreIds_taglist']"));


        // WebElement testDropDown = driver.findElement(By.id("testingDropdown"));
        //Select dropdown = new Select(testDropDown);
        Select dropdown = new Select(newsLetter);
        dropdown.selectByIndex(1);

        WebElement comment = driver.findElement(By.xpath("//textarea[@id='AdminComment' and @name='AdminComment']"));
        comment.sendKeys("6465656");


        // Enter All Details
        /*
WebElement emailCheck=driver.findElement(By.xpath("//input[@id='SearchEmail' and @name='SearchEmail']"));
emailCheck.sendKeys("allenikhil@gmail.com");
WebElement firstName=driver.findElement(By.xpath("//input[@id='SearchFirstName' and @name='SearchFirstName']"));
firstName.sendKeys("Nikhilesh");
WebElement lastName=driver.findElement(By.xpath("//input[@id='SearchLastName' and @name='SearchLastName']"));
lastName.sendKeys("Alle");
WebElement companyName=driver.findElement(By.xpath("//input[@id='SearchCompany' and @name='SearchCompany']"));
    companyName.sendKeys("Capgimini");
    WebElement ipAddrEnt=driver.findElement(By.xpath("//input[@id='SearchIpAddress' and @name='SearchIpAddress']"));
    ipAddrEnt.sendKeys("192.168.11.23");
    WebElement custList=driver.findElement(By.id("SelectedCustomerRoleIds_taglist"));
    custList.click();
    WebElement dateCSet=driver.findElement(By.xpath("//select[@id='SearchMonthOfBirth' and @name='SearchMonthOfBirth']"));
    dateCSet.click();

         */

    }
}
