package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WiINDOWSHandling4 {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        wd.get("https://www.amazon.in/");
        wd.manage().window().maximize();

        String Homewindow=wd.getWindowHandle();
        System.out.println(Homewindow);
        wd.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();

        Set<String>S1=wd.getWindowHandles();
        Iterator Itr1= S1.iterator();
        while(Itr1.hasNext()){

            String Cartwindow=Itr1.next().toString();
            System.out.println(Cartwindow);
            if(!Cartwindow.equals(Homewindow)){
                wd.switchTo().window(Cartwindow);
                wd.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
            }
        }
    }
}
