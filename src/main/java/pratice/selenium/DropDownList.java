package pratice.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DropDownList {
    @Test
    public void dropDown() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        SimpleDateFormat simpleFormat=new SimpleDateFormat();
        Date date=new Date();
        System.out.println(simpleFormat.format(date));
        String str=simpleFormat.format(date);



        TakesScreenshot ts=(TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\nikhil\\selenium"+str+".jpg");
        FileUtils.copyFile(dest,source);

    }

    public static void main(String[] args) {

    }
}
