package PageFactoryUsingAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin_PFA {
    WebDriver driver;

    @FindBy(id ="twotabsearchtextbox" )
    WebElement search;

    @FindBy(id = "nav-search-submit-button")
    WebElement search_button;

    public AmazonLogin_PFA(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
