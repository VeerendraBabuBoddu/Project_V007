package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DRAGandDROP {
    public static void main(String args[]){
        WebDriver wd=new ChromeDriver();
        wd.get("https://jqueryui.com/droppable/");
        wd.manage().window().maximize();

        wd.findElement(By.linkText("Droppable")).click();
        wd.switchTo().frame(0);

        WebElement Drag= wd.findElement(By.id("draggable"));
        WebElement Drop=wd.findElement(By.id("droppable"));

        Actions DnD=new Actions(wd);
        DnD.dragAndDrop(Drag,Drop).build().perform();
    }
}
