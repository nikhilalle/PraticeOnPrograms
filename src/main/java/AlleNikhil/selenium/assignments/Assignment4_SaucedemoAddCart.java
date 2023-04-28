package AlleNikhil.selenium.assignments;//package com.matrix.AlleNikhil.selenium.assignments;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Assignment4_SaucedemoAddCart {
//    Logger log= LogManager.getLogger(Assignment4_SaucedemoAddCart.class);
//
//    @Test
//    public void addCartDetails() {
//
//        log.info("Initiating webbrowser");
//        WebDriverManager.chromedriver().setup();
//        // System.setProperty("webdriver.chrome.driver", "D:\\Chrome New\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        log.info("Opening url");
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
//        log.info("Entering valid credentials into login page");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        log.error("Login btn clicked or not");
//        driver.findElement(By.id("login-button")).click();
//        log.info("Opened product page");
//        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
//        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
//        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket' and @name='remove-sauce-labs-fleece-jacket']")).click();
//        driver.findElement(By.id("checkout")).click();
//        driver.findElement(By.id("first-name")).sendKeys("Shri");
//        driver.findElement(By.id("last-name")).sendKeys("Alle");
//        driver.findElement(By.id("postal-code")).sendKeys("413005");
//        driver.findElement(By.id("continue")).click();
//        driver.findElement(By.id("finish")).click();
//
//        // Checking For CHECKOUT: COMPLETE or not
//
//        WebElement checkoutComplete = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
//        System.out.println(checkoutComplete.getText());
//        String actualResult = checkoutComplete.getText();
//        String exceptedResult = "THANK YOU FOR YOUR ORDER";
//        Assert.assertEquals(exceptedResult, actualResult);
//        //done
//
//    }
//}
