import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {

    @BeforeClass
    public void preClass(){
        System.out.println("Hello from Before Class");
    }

    @AfterClass
    public void postClass(){
        System.out.println("Hello from After Class");
    }

    @BeforeSuite
    public void preSuite(){
        System.out.println("Hello from Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Hello from After Suite");
    }


    @BeforeMethod
    public void preTest()
    {
        System.out.println("Hello from BeforeMethod");
    }

    @Test
    public void testMethod1(){
        System.out.println("Hello from TestMethod 1");

    }
    @Test
    public void testMethod2(){
        System.out.println("Hello from TestMethod 2");

    }
    @AfterMethod
    public void postTest(){
        System.out.println("Hello from After Method");
    }

}
