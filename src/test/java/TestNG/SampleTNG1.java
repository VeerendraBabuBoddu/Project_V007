package TestNG;

import org.testng.annotations.*;

public class SampleTNG1 {
    @Test
    public void testcase() {
        System.out.println("Test Execution");
    }
    @BeforeMethod
    public void beforemethod(){

        System.out.println("Before Method");
    }
    @BeforeClass
    public void beforeclass(){

        System.out.println("Before Class");
    }
    @BeforeTest
    public void beforetest()
    {
        System.out.println("Before Test");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("Before Suite");
    }
    @AfterMethod
    public void aftermethod(){

        System.out.println("After Method");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("After Class");
    }
    @AfterTest
    public  void aftertest()
    {
        System.out.println("After Test");
    }
    @AfterSuite
    public  void aftersuite(){
        System.out.println("After Suite");
    }
}
