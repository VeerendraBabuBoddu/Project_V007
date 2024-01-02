package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover2 {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        String url="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
        wd.manage().window().maximize();
        wd.get(url);

       wd.findElement(By.id("txtUsername")).sendKeys("Admin");
       wd.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
       wd.findElement(By.id("btnLogin")).click();

        Actions a=new Actions(wd);

        WebElement L=wd.findElement(By.xpath("//b[contains(text(),'Leave')]"));
        WebElement E=wd.findElement(By.id("menu_leave_Entitlements"));
        WebElement EE=wd.findElement(By.id("menu_leave_viewLeaveEntitlements"));

        a.moveToElement(L).moveToElement(E).moveToElement(EE).build().perform();
        wd.findElement(By.id("menu_leave_viewLeaveEntitlements")).click();

    }
}
