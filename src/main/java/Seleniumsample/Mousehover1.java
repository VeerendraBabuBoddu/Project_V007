package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover1 {
    public static void main(String args[])throws InterruptedException{
        WebDriver wd=new ChromeDriver();
        String url="https://jquery.com/";
        wd.manage().window().maximize();
        wd.get(url);

        Actions B=new Actions(wd);

        WebElement CONTRIBUTE= wd.findElement(By.linkText("Contribute"));
        WebElement BUG= wd.findElement(By.linkText("Bug Triage"));

        B.moveToElement(CONTRIBUTE).moveToElement(BUG).build().perform();

        BUG.click();


    }
}
