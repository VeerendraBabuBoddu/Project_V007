package Seleniumsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTitle{
    public static void main(String args[]){

        WebDriver wd=new ChromeDriver();
        wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wd.manage().window().maximize();

        String act_title= wd.getTitle();
        System.out.println(act_title);
        String exp_title="OrangeHRM";

        if(act_title.equals(exp_title)){
            System.out.println("Titles matched and application loaded is valid");
        }
        else{
            System.err.println("Titles not matched application is invalid");
        }
    }
}
