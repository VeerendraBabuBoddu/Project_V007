import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/destination.html"}
)
public class testrunner {
    public static WebDriver driver;
    @BeforeClass
    public static void startbrowser() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    @AfterClass
    public static void stopbrowser() {
        driver.quit();

    }
}
