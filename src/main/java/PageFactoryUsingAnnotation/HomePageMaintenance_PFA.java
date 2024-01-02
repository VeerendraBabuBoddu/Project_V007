package PageFactoryUsingAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMaintenance_PFA {
    WebDriver driver;
    @FindBy(id = "menu_maintenance_purgeEmployee")
    WebElement Maintenance;
    public HomePageMaintenance_PFA(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
