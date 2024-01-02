package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandle2 {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        wd.get("https://jqueryui.com/");
        wd.manage().window().maximize();

        String parentwindow=wd.getWindowHandle();
        System.out.println(parentwindow);
        wd.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();

        Set<String>windows=wd.getWindowHandles();
        Iterator itr=windows.iterator();
        while (itr.hasNext()){

            String currentwindow=itr.next().toString();
            System.out.println(currentwindow);

            if(!currentwindow.equals(parentwindow)){
                wd.switchTo().window(parentwindow);
                wd.findElement(By.xpath("//*[@id=\"content\"]/h1"));
            }


        }
    }

}
