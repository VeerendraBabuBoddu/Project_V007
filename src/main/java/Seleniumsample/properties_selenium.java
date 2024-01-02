package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties_selenium {
    public static void main(String args[]) throws IOException {
        File F = new File("C:\\Users\\VEERENDRA\\Documents\\prp1.txt");
        FileInputStream FIS = new FileInputStream(F);
        Properties p = new Properties();
        p.load(FIS);
        System.out.println(p.getProperty("ID"));
        System.out.println(p.getProperty("PSW"));


        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
        WebDriver wd = new ChromeDriver();
        wd.get(url);
        wd.manage().window().maximize();


        wd.findElement(By.id("txtUsername")).sendKeys(p.getProperty("ID"));
        wd.findElement(By.name("txtPassword")).sendKeys(p.getProperty("PSW"));
        wd.findElement(By.id("btnLogin")).click();
    }
}