package Seleniumsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSelenium001 {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        wd.get("https://www.amazon.co.uk/ref=nav_logo");
        wd.manage().window().maximize();

        String act_title=wd.getTitle();
        System.out.println(act_title);
        String exp_title="Amazon.co.uk";//: Low Prices in Electronics, Books, Sports Equipment &amp; more";

        if(act_title.equals(exp_title)){
            System.out.println("Titles are matched and application is valid");
        }
        else{
            System.err.println("Titles are not matched and application is invalid");
        }
    }
}
