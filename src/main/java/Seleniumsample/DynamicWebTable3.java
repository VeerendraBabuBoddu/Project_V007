package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTable3 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.goindigo.in/");
        Thread.sleep(4000);
        wd.manage().window().maximize();
        Thread.sleep(4000);
        wd.findElement(By.className("cmp-custom-drop-down__options__item_label")).click();
        wd.findElement(By.xpath("//*[@placeholder=From]")).sendKeys("Visakhapatnam");
        wd.findElement(By.xpath("//*[@placeholder=To]")).sendKeys("Hyderabad");

        String DOJ = "07/05/2024";
        String a[] = DOJ.split("/");
        String DATE = a[0];
        String YEAR = a[2];
        int x = Integer.parseInt(a[3]);

        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String Month = months[x - 1];

        String CalendarYear = wd.findElement(By.className("react-datepicker-ignore-onclickoutside")).getText();
        while (!CalendarYear.equals(YEAR)) {
            wd.findElement(By.className("react-datepicker__navigation react-datepicker__navigation--next")).click();
            CalendarYear = wd.findElement(By.className("react-datepicker-ignore-onclickoutside")).getText();

        }
        String CalendarMonth = wd.findElement(By.className("react-datepicker__current-month")).getText();
        while (!CalendarMonth.equals(Month)) {
            wd.findElement(By.className("react-datepicker__navigation react-datepicker__navigation--next")).click();
            CalendarMonth = wd.findElement(By.className("react-datepicker__current-month")).getText();
        }
        WebElement Table = wd.findElement(By.className("react-datepicker"));
        List<WebElement> rows = Table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows.size(); i++) {

            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < columns.size(); j++) {
                if (columns.get(j).getText().equals(DATE)) {
                    columns.get(j).click();
                }
            }

        }
    }
}
