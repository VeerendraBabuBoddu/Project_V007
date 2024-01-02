package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTable {
public static void main(String args[]) throws InterruptedException {
    WebDriver wd=new ChromeDriver();
    wd.get("https://www.esky.co.uk/");
    Thread.sleep(4000);
    wd.manage().window().maximize();
    Thread.sleep(4000);
    wd.findElement(By.id("TripTypeOneway")).click();
    wd.findElement(By.id("departureOneway")).sendKeys("London");
    wd.findElement(By.id("arrivalOneway")).sendKeys("Visakhapatnam");

    String DOFJ="7/05/2024";
    wd.findElement(By.id("departureDateOneway")).click();
    //Splitting date into individuals
    String a[]=DOFJ.split("/");
    String DATE=a[0];
    String YEAR=a[2];
    int x=Integer.parseInt(a[1]);

    String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
    String MONTH=months[x-1];

    String calendaryear=wd.findElement(By.className("ui-datepicker-year")).getText();
    while(!calendaryear.equals(YEAR)){
        wd.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        calendaryear=wd.findElement(By.className("ui-datepicker-year")).getText();
        System.out.println(calendaryear);
    }
    String calendarmonth=wd.findElement(By.className("ui-datepicker-month")).getText();
    while(!calendarmonth.equals(MONTH)){
        wd.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        calendarmonth=wd.findElement(By.className("ui-datepicker-month")).getText();
        System.out.println(calendarmonth);
    }
    WebElement Table=wd.findElement(By.className("ui-datepicker-calendar"));
    List<WebElement>rows=Table.findElements(By.tagName("tr"));
    for(int i=0;i< rows.size();i++){

        List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
        for(int j=0;j< columns.size();j++){
        if(columns.get(j).getText().equals(DATE)){
            columns.get(j).click();
        }
        }
    }



}
}

