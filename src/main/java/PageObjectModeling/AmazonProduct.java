package PageObjectModeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonProduct {
    WebDriver driver ;
    private static WebElement element=null;

    public static WebElement Books(WebDriver driver){
       element= driver.findElement(By.xpath("//*[contains(text(),'Chota Bheem Comics Volume-8 || Kotha Bola Tota Pakhi')]"));
        return element;
    }
}
