package pratice.selenium.pageObjectModel3_MoviesDateVerify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WikiPage {
    WebDriver driver;

    String releaseDateWiki;
    String countryReleaseWiki ;


    public WikiPage(WebDriver driver){
        this.driver=driver;
    }
    @Test
    public void pageWiki() {
        By title = By.xpath("//a[@title='Pushpa: The Rise']");
        By releaseDate = By.xpath("//div[text()='Release date']//following::div[1]");
        By releaseCounty = By.xpath("//td[@class='infobox-data' and text()='India']");
        By searchElement = By.id("searchInput");
        By submitBtn = By.xpath("//button[@type='submit']");


        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.findElement(searchElement).sendKeys("pushpa the rise");
        driver.findElement(submitBtn).click();
        WebElement movieName = driver.findElement(title);

        Actions actions = new Actions(driver);
        actions.moveToElement(movieName).doubleClick().build().perform();

         releaseDateWiki = driver.findElement(releaseDate).getText();
        countryReleaseWiki = driver.findElement(releaseCounty).getText();


    }
    public List<String > listWikiElement(){

        List<String> movieDetail = new ArrayList<>();
        movieDetail.add(releaseDateWiki);
        movieDetail.add(countryReleaseWiki);
        System.out.println(movieDetail);
        return  movieDetail;

    }
}
