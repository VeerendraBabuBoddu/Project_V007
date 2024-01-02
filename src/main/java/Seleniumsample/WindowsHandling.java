package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandling {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        wd.get("https://demo.guru99.com/popup.php");
        wd.manage().window().maximize();
// For Parent Window
        String Parentwindow=wd.getWindowHandle();
        System.out.println(Parentwindow);
        wd.findElement(By.xpath("/html/body/p/a")).click();
//For Multiple Windows
        Set<String>S1=wd.getWindowHandles();
        Iterator I1= S1.iterator();

        while (I1.hasNext()){

            String Childwindow=I1.next().toString();
            System.out.println(Childwindow);

            if(!Childwindow.equals(Parentwindow)){
                wd.switchTo().window(Childwindow);

                wd.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("veerendrababu2019@gmail.com");
            }

        }
    }
}
