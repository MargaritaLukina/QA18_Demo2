import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartDemo {
    WebDriver wd;

@BeforeMethod
    public void preCondition(){
        wd=new ChromeDriver();
    }
@Test
    public void testLogin(){

    }
@AfterMethod
    public void postCondition(){
//wd.close();
    }
}
