package AlleNikhil.cucumber;//package com.matrix.AlleNikhil.cucumber;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class LoginTest {
//    WebDriver driver;
//    @Test
//   @Given("User Name enter")
//    public void loginData() {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//    }
//
//
//    @When("User Password enter")
//    public void userPasswordEnter() {
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//    }
//    @Test
//    @And("Login click$")
//    public void clickBtn(){
//        driver.findElement(By.id("login-button")).click();
//
//    }
//    @BeforeMethod
//    public void tearDown(){
//        driver.quit();
//    }
//}
