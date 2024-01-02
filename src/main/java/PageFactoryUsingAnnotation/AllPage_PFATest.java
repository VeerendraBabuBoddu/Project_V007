package PageFactoryUsingAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllPage_PFATest {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(4000);


        LoginPage_PFA LG=new LoginPage_PFA(driver);
        HomePageMaintenance_PFA HG=new HomePageMaintenance_PFA(driver);
        LG.Username.sendKeys("Admin");
        LG.Password.sendKeys("Qedge123!@#");
        LG.Login_button.click();

        HG.Maintenance.click();
    }
}
