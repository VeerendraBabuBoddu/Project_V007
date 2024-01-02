package PageFactoryUsingAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin_PFATest {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        AmazonLogin_PFA ALP=new AmazonLogin_PFA(driver);
        AmazonProduct_PFA AP=new AmazonProduct_PFA(driver);
        ALP.search.sendKeys("Harry Potter Books");
        ALP.search_button.click();
        AP.Book.click();
    }
}
