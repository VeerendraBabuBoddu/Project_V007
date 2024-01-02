package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandling1 {
    public static void main(String args[]) {
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.amazon.in/");

        String parentwindow = wd.getWindowHandle();
        System.out.println(parentwindow);
        wd.findElement(By.xpath("")).click();

        Set<String> windows = wd.getWindowHandles();
        Iterator itr = windows.iterator();
        while (itr.hasNext()) {

            String currentwindow = itr.next().toString();
            System.out.println(currentwindow);

            if (!currentwindow.equals(parentwindow)) {
                wd.switchTo().window(currentwindow);
                wd.findElement(By.xpath("//*[@id=\"ap_email\"]"));
            }

        }
    }
}
