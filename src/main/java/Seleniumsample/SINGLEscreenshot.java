package Seleniumsample;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

    public class SINGLEscreenshot {
        public static void main(String args[]) throws IOException {
            WebDriver wd = new ChromeDriver();
            String url = "https://www.amazon.in/";
            wd.manage().window().maximize();
            wd.get(url);

            File SC = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(SC, new File("C:\\Users\\VEERENDRA\\Documents\\sample.png"));
        }
        }

