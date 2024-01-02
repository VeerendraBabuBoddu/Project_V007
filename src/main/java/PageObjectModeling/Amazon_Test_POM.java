package PageObjectModeling;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Test_POM {
    private static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
       // AmazonHomePage.search(driver).sendKeys("chota bheem comics");
        //AmazonHomePage.search_button(driver).click();
       // AmazonProduct.Books(driver).click();
        AmazonHomePage.search(driver).sendKeys("Milkshake Blender");
        AmazonHomePage.search_button(driver).click();
        Actions A=new Actions(driver);
        WebElement W=AmazonMilkshakeProduct.Blender(driver);
        A.moveToElement(W).build().perform();
        W.click();
    }
}
