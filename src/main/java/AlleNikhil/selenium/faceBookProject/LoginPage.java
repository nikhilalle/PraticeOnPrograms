package AlleNikhil.selenium.faceBookProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    public void login(WebDriver driver){

        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Nikhil");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Alle");
        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("8790348488");
        driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Nikh@1255@Sh");

        WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));

        Select selectDate=new Select(date);
        selectDate.selectByIndex(18);
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select selectMonth=new Select(month);
        selectMonth.selectByVisibleText("Nov");

        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selectYear=new Select(year);
        selectYear.selectByValue("1994");

        driver.findElement(By.xpath("//input[@name='sex' and  @value='2']")).click();
    }
}
