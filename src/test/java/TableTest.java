import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    WebDriver wd;

    @BeforeMethod
    public void preTest() {
        wd= new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void TableRow(){
       WebElement we= wd.findElement(By.cssSelector("#customers"));

       List<WebElement> wl=wd.findElements(By.cssSelector("#customers tr"));
       System.out.println(wl.size());

       List<WebElement> wl1=wd.findElements(By.cssSelector("#customers tr th"));
        System.out.println(wl1.size());

       List<WebElement> wl2=wd.findElements(By.cssSelector("#customers th"));
        System.out.println(wl2.size());




    }

}
