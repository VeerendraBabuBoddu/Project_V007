package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mhover {
    public static void main(String args[]){
        WebDriver wd= new ChromeDriver();
        String url="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
        wd.manage().window().maximize();
        wd.get(url);


       wd.findElement(By.id("txtUsername")).sendKeys("Admin");
        wd.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();

        Actions A=new Actions(wd);

        WebElement PIM= wd.findElement(By.xpath("//*[contains(text(),'PIM')]"));
        WebElement CON=wd.findElement(By.id("menu_pim_Configuration"));
        WebElement CUST=wd.findElement(By.id("menu_pim_listCustomFields"));

        A.moveToElement(PIM).moveToElement(CON).moveToElement(CUST).build().perform();
        CUST.click();
    }
}
