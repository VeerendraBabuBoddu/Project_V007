package Seleniumsample;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MULTIPLEScreenshots {
    public static void main(String args[]) throws IOException {
        WebDriver wd=new ChromeDriver();
        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");


        wd.manage().window().maximize();

        List<WebElement> Links=wd.findElements(By.tagName("a"));
        for(int i=0;i<Links.size();i++){
            String LinkName=Links.get(i).getText();
            Links.get(i).click();
            File MSC=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(MSC,new File("C:\\Users\\VEERENDRA\\Pictures\\Saved Pictures"+LinkName+".png"));
            wd.navigate().forward();
            Links=wd.findElements(By.tagName("a"));
        }
    }
}
