package PageObjectModeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonMilkshakeProduct {
    WebDriver driver;
    private static WebElement element=null;

    public static WebElement Blender(WebDriver driver){
        element= driver.findElement(By.xpath("//*[contains(text(),'NutriPro Juicer Mixer Grinder - Smoothie Maker - 500 Watts (3 Jars 2 Blades)')]"));
        return element;
    }
}
