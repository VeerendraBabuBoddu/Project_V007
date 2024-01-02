package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticWebTable {
    public static void  main(String args[]){
        WebDriver wd=new ChromeDriver();
        wd.get("https://demo.guru99.com/test/web-table-element.php");
        wd.manage().window().maximize();

        WebElement TABLE= wd.findElement(By.className("dataTable"));
        List<WebElement>ROWS=TABLE.findElements(By.tagName("tr"));
        for(int i=0;i< ROWS.size();i++){
            List<WebElement>COLUMNS=ROWS.get(i).findElements(By.tagName("td"));
            for(int j=0;j<COLUMNS.size();j++){
                System.out.println(COLUMNS.get(j).getText());
            }
        }

    }
}
