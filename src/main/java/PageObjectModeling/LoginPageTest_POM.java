package PageObjectModeling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest_POM {
    private static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {

       WebDriver driver=new ChromeDriver();
        String url="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.get(url);

        LoginPage.username(driver).sendKeys("Admin");
        LoginPage.password(driver).sendKeys("Qedge123!@#");
        LoginPage.login(driver).click();
    }
}
