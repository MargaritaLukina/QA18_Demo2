import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartDemo {
    WebDriver wd;
    WebDriver wd2;
    WebElement element;

    @BeforeMethod
    public void preCondition() {
        System.out.println("Start preCondition");
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

        System.out.println("End preCondition");
    }

    @Test
    public void testLogin() {
        System.out.println("Start Test");

        WebElement we= wd.findElement(By.className("container"));

        System.out.println(we.getTagName());
        System.out.println(we.getAttribute("id"));


        WebElement ed= wd.findElement(By.id("root"));
        System.out.println(ed.getAttribute("class"));


        WebElement login = wd.findElement(By.linkText("LOGIN"));
        System.out.println(login.getAttribute("href"));

        WebElement login1 = wd.findElement(By.xpath("//a[text()='LOGIN']"));
        System.out.println(login1.getAttribute("href"));

        WebElement login2 = wd.findElement(By.xpath("//a[contains(@href, '/login')]"));
        System.out.println(login2.getAttribute("href"));



        WebElement container = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el2=wd.findElement(By.xpath("//*[starts-with(@style,'border')]"));
//*[starts-with(@attribute_name,'attribute_value')]

      ///  System.out.println(we);

       System.out.println("End Test");
    }

    @AfterMethod
    public void postCondition() {
        System.out.println("Start postCondition");
       // wd.close();
        System.out.println("End postCondition");
    }
}
