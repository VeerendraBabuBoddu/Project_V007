package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Resizeable {
    public static void main(String args[]) throws InterruptedException {
        WebDriver wd=new ChromeDriver();
        String url="https://jqueryui.com/resizable/";
        wd.manage().window().maximize();
        wd.get(url);
Thread.sleep(4000);
      WebElement fr=  wd.findElement(By.xpath("//*[@id=\"resizable\"]"));
        wd.switchTo().frame(0);
        WebElement Resize=wd.findElement(By.xpath("//*[@id=resizable]/div[3]"));

        Actions RSZ=new Actions(wd);
        RSZ.dragAndDropBy(Resize,300,100).perform();
    }
}
