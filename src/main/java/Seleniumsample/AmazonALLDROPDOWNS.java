package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonALLDROPDOWNS {
    public static void main(String args[]) {

        String url = "https://www.amazon.in/";
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get(url);
        WebElement drop = wd.findElement(By.id("searchDropdownBox"));
        List<WebElement> dropd = drop.findElements(By.tagName("option"));

        System.out.println(dropd.size());
        String c = "Books";

        for(int i = 0; i < dropd.size(); i++) {
            System.out.println(dropd.get(i).getText());

            if (c.equals(dropd.get(i).getText())) {
                dropd.get(i).click();
                break;
            }
        }



        wd.findElement(By.id("searchDropdownBox")).sendKeys("BOOKS");
        wd.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
        wd.findElement(By.id("nav-search-submit-button")).click();
    }
}
