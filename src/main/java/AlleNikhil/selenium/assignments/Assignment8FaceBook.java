package AlleNikhil.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class Assignment8FaceBook {
    /**
     * Assignment No. 8: Use select here
     * Steps:
     * Open https://www.facebook.com/
     * Click on Create New Account
     * Select 18-Nov-1994 from 3 dropdowns
     * Also, get all months(Jan-Dec from the month dropdown and verify
     * it has correct months or not (use Assert here).
     */
    @Test
    public void dropDownList() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Nikhil");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Alle");
        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("8790348488");
        driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Nikh@1255@Sh");

        WebElement birthDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));

        Select selectDate = new Select(birthDate);
        selectDate.selectByIndex(18);
        WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select selectMonth = new Select(birthMonth);
        selectMonth.selectByVisibleText("Nov");

        WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selectYear = new Select(birthYear);
        selectYear.selectByValue("1994");

        driver.findElement(By.xpath("//input[@name='sex' and  @value='2']")).click();

        Thread.sleep(3500);

        System.out.println("------------All Month Print----------");

        List<WebElement> listOfMonth = driver.findElements(By.xpath("//span[@class='_5k_4']//select[@name='birthday_month']/option"));
        System.out.println(listOfMonth.size());
        System.out.println(listOfMonth);


        List<String> actualMonth = new ArrayList<>();
        actualMonth.add("Jan");
        actualMonth.add("Feb");
        actualMonth.add("Mar");
        actualMonth.add("Apr");
        actualMonth.add("May");
        actualMonth.add("Jun");
        actualMonth.add("Jul");
        actualMonth.add("Aug");
        actualMonth.add("Sep");
        actualMonth.add("Oct");
        actualMonth.add("Nov");
        actualMonth.add("Dec");
        System.out.println(actualMonth);

        Iterator<WebElement> itr = listOfMonth.iterator();
        ArrayList excpectedlist = new ArrayList<>();

        /**
         Using Iterator Value Stored in ExpectedlIST in Array List
         i.e ArrayList Excpectedlist=new ArrayList();
         System.out.println(element.getText());    Using This Valve Feathing and
         Excpectedlist.add(element.getText());    Stored in Excpectedlist in Array List
         **/

        while (itr.hasNext()) {
            WebElement element = itr.next();
            System.out.println(element.getText());
            excpectedlist.add(element.getText());
        }
        System.out.println(excpectedlist);
        System.out.println(excpectedlist.size());

        Assert.assertEquals(actualMonth, excpectedlist);

        /*
        // Using For Each And Value Stored in ExcpectedlIST in Array List
        for (WebElement element:listOfMonth) {
            System.out.println(element.getText());
            Excpectedlist.add(element.getText());
       }
       */
        //Done
    }

}
