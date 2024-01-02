package TestNG;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PriorityTestNG {

    @Test(priority =0)
    public void A(){
        System.out.println("Print Test_A");
    }
    @Test(priority = 1)
    public void a(){
        System.out.println("Print Test_a");
    }
    @Test(priority = 2)
    public void B(){
        System.out.println("Print Test_B");
    }
    @Test(priority = 3)
    public void C(){
        System.out.println("Print Test_C");
    }
}
