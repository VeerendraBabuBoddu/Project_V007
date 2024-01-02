package PageObjectModeling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class All_Pages_Test_File {
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
        WebElement PIM= HomePagePIM.PIM(driver);
        WebElement CON=HomePagePIM.CONFIGURATION(driver);
        WebElement CUST=HomePagePIM.CUSTOMFIELD(driver);
        Actions A=new Actions(driver);
        A.moveToElement(PIM).moveToElement(CON).moveToElement(CUST).build().perform();
        CUST.click();
       /* Actions Recru=new Actions(driver);
        WebElement R=HomePageRECRU.Recruitment(driver);
        WebElement C=HomePageRECRU.Candidates(driver);
        Recru.moveToElement(R).moveToElement(C).build().perform();
        C.click();*/
       /* WebElement Maintain=MaintenancePage.Maintenance(driver);
        Actions M=new Actions(driver);
        M.moveToElement(Maintain).build().perform();
        Maintain.click();*/

    }
}
