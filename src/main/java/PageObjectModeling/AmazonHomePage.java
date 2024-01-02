package PageObjectModeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
    WebDriver driver;
    //HomePage Elements same for both Books and Blender
    private static WebElement element=null;public static WebElement search(WebDriver driver){
         element= driver.findElement(By.id("twotabsearchtextbox"));
         return element;
    }
    public static WebElement search_button(WebDriver driver){
        element= driver.findElement(By.id("nav-search-submit-button"));
        return element;
    }
}
