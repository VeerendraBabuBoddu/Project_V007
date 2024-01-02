package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
    public static void main(String args[]) {
        WebDriver wd = new ChromeDriver();
        wd.get("https://jqueryui.com/");
        wd.manage().window().maximize();

        wd.findElement(By.linkText("Selectable")).click();
        wd.switchTo().frame(0);
        WebElement Item1=wd.findElement(By.xpath("//*[contains(text(),\"Item 1\")]"));
        WebElement Item2=wd.findElement(By.xpath("//*[contains(text(),\"Item 2\")]"));

        Actions ItemSelects=new Actions(wd);
        ItemSelects.clickAndHold(Item2).build().perform();
    }
}
