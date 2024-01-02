package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SheinMouseHover {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        wd.get("https://www.shein.in/");
        wd.manage().window().maximize();

        Actions Shein=new Actions(wd);

        WebElement Cat=wd.findElement(By.className("header-optimize__cate first-cate"));
        WebElement Kids=wd.findElement(By.xpath("//*[contains(text(), 'Kids' )]"));
        WebElement Collection=wd.findElement(By.className("nav-type__text"));

        Shein.moveToElement(Cat).moveToElement(Kids).moveToElement(Collection).build().perform();
        Collection.click();
    }
}
