package AlleNikhil.selenium.pageObjectModel3_MoviesDateVerify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ImdbPage {
    WebDriver driver;
    String releaseCountry;
    String releaseCountryDate;

    public ImdbPage(WebDriver driver) {
        this.driver = driver;


    }

    @Test
    public void PageImdb() {
        By enterElement = By.xpath("//div[@role='combobox']//input[@type='text']");
        By searchBtn = By.id("suggestion-search-button");
        By searchUnderElement = By.xpath("//td[@class='result_text']//a[text()='Pushpa: The Rise - Part 1']");
        By clickOnDetails = By.xpath("//div[@class='ipc-title__wrapper']//span[text()='Details']");
        By dateOfRelease = By.xpath("//a[text()='January 7, 2022 (United States)']");
        By release = By.xpath("//*[@id='releaseinfo_content']/table/tbody/tr[6]/td[2][text()='17 December 2021']");
        By countyRelease = By.linkText("India");


        driver.get("https://www.imdb.com/");
        driver.manage().window().maximize();

        driver.findElement(enterElement).sendKeys("Pusha The Rise");
        driver.findElement(searchBtn).click();
        driver.findElement(searchUnderElement).click();

        driver.findElement(clickOnDetails).click();
        WebElement releaseDate = driver.findElement(dateOfRelease);
        releaseDate.click();


        releaseCountry = driver.findElement(countyRelease).getText();
        releaseCountryDate = driver.findElement(release).getText();
    }


        public List<String > listImdbElement()
    {
        List<String> movieDetails = new ArrayList<>();
        movieDetails.add(releaseCountryDate);
        movieDetails.add(releaseCountry);
        System.out.println(movieDetails);
        return movieDetails;

    }
    }

