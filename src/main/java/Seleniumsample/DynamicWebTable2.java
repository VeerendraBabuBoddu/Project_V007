package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicWebTable2 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.nationalexpress.com/en");
        Thread.sleep(4000);
        //wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        Thread.sleep(4000);
        //wd.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        wd.findElement(By.id("fromStation")).sendKeys("Kent");
        wd.findElement(By.id("toStation")).sendKeys("Newcastle");
        Thread.sleep(4000);
        //wd.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        wd.findElement(By.id("single")).click();

        String DOJ = "8/01/2024";
        wd.findElement(By.id("departDate")).click();
        String a[] = DOJ.split("/");
        String Date = a[0];
        String Year=a[2];
        int x = Integer.parseInt(a[1]);


        String Months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String M1 = Months[x - 1];



        String calendaryear=wd.findElement(By.className("ui-datepicker-year")).getText();
        while (!calendaryear.equals(Year)){
            wd.findElement (By.xpath("//*[@id='showSingle']/div/div/button[2]/i")).click();
         calendaryear=wd.findElement(By.className("ui-datepicker-year")).getText();
            System.out.println(calendaryear);
        }
        String calendarmonth = wd.findElement(By.className("ui-datepicker-month")).getText();
        while (!calendarmonth.equals(M1)) {
            wd.findElement(By.xpath("//*[@id='showSingle']/div/div/button[2]/i")).click();
            calendarmonth = wd.findElement(By.id("ui-datepicker-month")).getText();
            System.out.println(calendarmonth);
        }
        WebElement Table = wd.findElement(By.className("ui-datepicker-calendar"));
        List<WebElement> rows = Table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows.size(); i++) {

            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < columns.size(); j++) {
                if (columns.get(j).getText().equals(Date)) {
                    columns.get(j).click();

                }
            }
        }
    }
}