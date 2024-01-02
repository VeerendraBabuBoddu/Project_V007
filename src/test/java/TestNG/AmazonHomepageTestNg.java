package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonHomepageTestNg {
    WebDriver driver;
    @BeforeMethod
    public void Before() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
    }
    @Test()
    public void Test() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ISTQB Book");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[contains(text(),'ISTQB® Certified Tester Foundation Level: A Self-Study Guide Syllabus v4.0')]")).click();
    }
   @AfterMethod
    public void After(){

        System.out.println("Purchase the selected Book");
    }

}
