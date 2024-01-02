package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;

public class RadioButton1 {
    public static void main(String args[]) {
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");
        wd.manage().window().maximize();

        wd.findElement(By.name("cinterestrate")).clear();
        wd.findElement(By.name("cinterestrate")).sendKeys("66");
        wd.findElement(By.id("cremainingyear")).clear();
        wd.findElement(By.id("cremainingyear")).sendKeys("215");
        Boolean a = wd.findElement(By.id("cpayoff3")).isSelected();
        System.out.println(a);

        Boolean b = wd.findElement(By.id("c2payoff3")).isSelected();
        System.out.println(b);
        Boolean c = wd.findElement(By.name("x")).isDisplayed();
        System.out.println(c);
        wd.findElement(By.xpath("//input[@onclick='clearForm(document.calform2);']")).click();
        wd.findElement(By.xpath("//*[contains(text(),'Payoff in 17 years and 3 months')]")).click();
        wd.findElement(By.xpath("//*[contains(text(),'Payoff in 14 years and 4 months')]")).click();
        wd.findElement(By.xpath("//a[@href=\"#\" and @onclick=\"document.getElementById('camortizationdiv1').style.display='block';return false;\" ]")).click();
        wd.findElement(By.xpath("//td[contains(text(),'Payoff in')]")).click();
        wd.findElement(By.xpath("//img [@src='//d26tpo4cm8sb6k.cloudfront.net/img/svg/insm.svg']")).click();
        wd.findElement(By.xpath("//*[contains(text(),\"This mortgage payoff calculator helps evaluate how adding extra payments or bi-weekly payments can save on interest and shorten mortgage term.\")]")).click();


}
}