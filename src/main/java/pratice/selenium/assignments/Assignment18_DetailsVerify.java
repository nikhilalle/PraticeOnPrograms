package pratice.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment18_DetailsVerify {
    WebDriver driver;
    @BeforeMethod
    public void intiBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }
    @Test
    public void checkPage(){

        driver.get("https://www.imdb.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@role='combobox']//input[@type='text']")).sendKeys("Pusha The Rise");
        driver.findElement(By.id("suggestion-search-button")).click();
        driver.findElement(By.xpath("//td[@class='result_text']//a[text()='Pushpa: The Rise - Part 1']")).click();

        driver.findElement(By.xpath("//div[@class='ipc-title__wrapper']//span[text()='Details']")).click();
        WebElement releaseDate=driver.findElement(By.xpath("//a[text()='January 7, 2022 (United States)']"));
        releaseDate.click();
        System.out.println(releaseDate);

        String releaseCountry=driver.findElement(By.linkText("India")).getText();
        String releaseCountryDate=driver.findElement(By.xpath("//*[@id='releaseinfo_content']/table/tbody/tr[6]/td[2][text()='17 December 2021']")).getText();
        System.out.println(releaseCountry);
        System.out.println(releaseCountryDate);

        List<String> movieDetails=new ArrayList<>();
        movieDetails.add(releaseCountryDate);
        movieDetails.add(releaseCountry);
        System.out.println(movieDetails);

        //wikipedia
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchInput")).sendKeys("pushpa the rise");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement movieName=driver.findElement(By.xpath("//a[@title='Pushpa: The Rise']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(movieName).doubleClick().build().perform();
        String releaseDateWiki=driver.findElement(By.xpath("//div[text()='Release date']//following::div[1]")).getText();
        String countryReleaseWiki=driver.findElement(By.xpath("//td[@class='infobox-data' and text()='India']")).getText();
        List<String> movieDetail=new ArrayList<>();
        movieDetail.add(releaseDateWiki);
        movieDetail.add(countryReleaseWiki);
        System.out.println(movieDetail);
        Assert.assertEquals(movieDetail,movieDetails);


    }
    @AfterMethod
    public void tearDown(){
        driver.close();

    }
}
