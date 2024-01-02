package PageObjectModeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageMaintenance {
    WebDriver driver;
    private  static WebElement element=null;
    public static WebElement Maintenance(WebDriver driver){
        element=driver.findElement(By.id("menu_maintenance_purgeEmployee"));
        return element;
    }
}
