package Seleniumsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustEatSelenium {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        wd.get("https://www.just-eat.co.uk/takeaway/london?adj_tracker=84l7irb&adj_campaign=410398571&campaignname=CM_S_G_GBR_EN_%5BBRAND%5D_%5BENGM%5D_Just%20Eat_Root_London_1006886&gad_source=1&gclid=CjwKCAiAvdCrBhBREiwAX6-6UvsL_sXbKf7tdK9TEU8QCsRAb5AClEl_CyiPJ4kYJeEUGTuyG06C5xoCsY4QAvD_BwE&gclsrc=aw.ds");
        wd.manage().window().maximize();

        String act_title= wd.getTitle();
        System.out.println(act_title);
        String exp_title="Food Takeaway and Delivery in London | Order From Just Eat";
        if(act_title.equals(exp_title)){
            System.out.println("Titles are matched and application is valid");
        }
        else{
            System.err.println("Titles are not matched and application is invalid");
        }
    }
}
