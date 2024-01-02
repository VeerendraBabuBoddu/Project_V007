package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandle3 {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        wd.get("https://jquery.com/");
        wd.manage().window().maximize();

        String blogwindow= wd.getWindowHandle();
        System.out.println(blogwindow);
        wd.findElement(By.xpath("//*[@id=\"menu-top\"]/li[3]/a")).click();

        Set<String>windows=wd.getWindowHandles();
        Iterator itr= windows.iterator();
        while (itr.hasNext()) {


            String foundationwindow = itr.next().toString();
            System.out.println(foundationwindow);
            if (!foundationwindow.equals(blogwindow)) {
                wd.switchTo().window(foundationwindow);

                wd.findElement(By.xpath("//*[@id=\"content\"]/header"));
            }
        }

    }
}
