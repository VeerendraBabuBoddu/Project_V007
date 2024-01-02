package PageObjectModeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePIM {
    WebDriver driver;
    private static WebElement element=null;
    public static WebElement PIM(WebDriver driver){
        element=driver.findElement(By.xpath("//*[contains(text(),'PIM')]"));
        return element;
    }
    public static WebElement CONFIGURATION(WebDriver driver){
        element= driver.findElement(By.id("menu_pim_Configuration"));
        return element;
    }
    public static WebElement CUSTOMFIELD(WebDriver driver){
        element= driver.findElement(By.id("menu_pim_listCustomFields"));
        return element;
    }
}
