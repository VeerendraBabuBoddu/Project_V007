package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {
      public static void main(String args[]){
          WebDriver wd=new ChromeDriver();
          String url="https://jqueryui.com/";
          wd.manage().window().maximize();
          wd.get(url);

          wd.findElement(By.linkText("Sortable")).click();
          wd.switchTo().frame(0);
          Point x= wd.findElement(By.xpath("//li[contains(text(),'Item 1')]")).getLocation();
          //System.out.println(Point.x);
          WebElement ITEM2=wd.findElement(By.xpath("//li[contains(text(),'Item2')]"));
          WebElement ITEM3=wd.findElement(By.linkText("//li[contains(text(),'Item 3')]"));
          WebElement ITEM4=wd.findElement(By.xpath("//li[contains(text(),'Item 4')]"));
          Actions AA=new Actions(wd);
       //   AA.clickAndHold().
      }
}
