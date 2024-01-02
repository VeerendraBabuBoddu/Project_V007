package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class StaticWebTable1 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver wd=new ChromeDriver();
        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        Thread.sleep(4000);
        wd.manage().window().maximize();

        wd.findElement(By.id("txtUsername")).sendKeys("Admin");
        wd.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();

        Actions A=new Actions(wd);
        WebElement PIM=wd.findElement(By.id("menu_pim_viewPimModule"));
        A.moveToElement(PIM).build().perform();
        wd.findElement(By.id("menu_pim_viewPimModule")).click();

         WebElement Table=wd.findElement(By.id("resultTable"));
        List<WebElement> Rows=Table.findElements(By.tagName("tr"));
        for(int i=0;i< Rows.size();i++){
        List<WebElement>Columns=Rows.get(i).findElements(By.tagName("td"));
        for (int j=0;j< Columns.size();j++){
            System.out.println(Columns.get(j).getText());
        }
        }

    }
}
