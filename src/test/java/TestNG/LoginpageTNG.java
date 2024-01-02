package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginpageTNG {
    WebDriver wd;


    @BeforeMethod
    public void beforemethod() throws InterruptedException {
        Thread.sleep(4000);
        String url="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
        wd=new ChromeDriver();
        wd.manage().window().maximize();
        wd.get(url);
        Thread.sleep(4000);
    }
    @Test
    public void logintest() throws InterruptedException {
      Thread.sleep(4000);
        wd.findElement(By.name("txtUsername")).sendKeys("Admin");
        wd.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();

        String exp_title="OrangeHRM";
        String act_title= wd.getTitle();

        if (exp_title.equals(act_title)){
            System.out.println("Titles are matched");
        }
        else{
            System.out.println("Titles not matched");
        }
    }
    @AfterMethod
    public void aftermethod(){

        System.out.println("Executes final test");
        wd.close();
    }
}
