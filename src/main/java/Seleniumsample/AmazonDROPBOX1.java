package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDROPBOX1 {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        String url="https://www.amazon.in";
        wd.manage().window().maximize();

        wd.get(url);
        wd.findElement(By.id("searchDropdownBox")).sendKeys("Books");
        wd.findElement(By.id("twotabsearchtextbox")).sendKeys("chota bheem comics");
        wd.findElement(By.id("nav-search-submit-button")).click();
    }
}
