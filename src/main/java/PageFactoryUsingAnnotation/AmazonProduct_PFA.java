package PageFactoryUsingAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProduct_PFA {
    WebDriver driver;
    @FindBy(xpath = "//*[contains(text(),'Harry Potter and the Goblet of Fire')]")
    WebElement Book;

    public AmazonProduct_PFA(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
