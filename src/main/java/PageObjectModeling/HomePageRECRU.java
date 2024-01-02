package PageObjectModeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageRECRU{
    WebDriver driver;
    private static WebElement element = null;
    public static WebElement Recruitment(WebDriver driver) {
        element = driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
        return element;
    }

    public static WebElement Candidates(WebDriver driver) {
        element = driver.findElement(By.id("menu_recruitment_viewCandidates"));
        return element;
    }
}