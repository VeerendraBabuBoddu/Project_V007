package Seleniumsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAFoxSelenium {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        wd.get("https://www.qafox.com/");
        wd.manage().window().maximize();

        String act_Title=wd.getTitle();
        System.out.println(act_Title);
        String exp_Title="Home - QAFox";

        if(act_Title.equals(exp_Title)){
            System.out.println("Titles are matched and application is valid");
        }
        else{
            System.err.println("Titles are not matched and application is invalid");
        }

    }
}
