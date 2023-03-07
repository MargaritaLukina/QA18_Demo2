import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver wd;
    String correctLogin="ml1@gmail.com";
    String correctPassword="123P@ssword";

    String incorrectLogin="ml2@gmail.com";
    String incorrectPassword="1111";

    String emptyLogin="";
    String emptyPassword="";

 @BeforeMethod
    public void preCondition() {
        System.out.println("Start preCondition");
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

        System.out.println("End preCondition");
    }

    @Test
    public void LoginInputPositive(){
        WebElement inputLogin= wd.findElement(By.xpath("//input[1]"));
        inputLogin.click();
        inputLogin.clear();
        inputLogin.sendKeys(correctLogin);

        WebElement inputPassword=wd.findElement(By.xpath("//input[2]"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys(correctPassword);

        WebElement loginBtn = wd.findElement(By.xpath("//button[1]"));
        loginBtn.click();

    }
    @Test
    public void LoginInputNegative1(){
        WebElement inputLogin= wd.findElement(By.xpath("//input[1]"));
        inputLogin.click();
        inputLogin.clear();
        inputLogin.sendKeys(incorrectLogin);

        WebElement inputPassword=wd.findElement(By.xpath("//input[2]"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys(incorrectPassword);

        WebElement loginBtn = wd.findElement(By.xpath("//button[1]"));
        loginBtn.click();

    }

    @Test
    public void LoginInputNegative2(){
        WebElement inputLogin= wd.findElement(By.xpath("//input[1]"));
        inputLogin.click();
        inputLogin.clear();
        inputLogin.sendKeys(correctLogin);

        WebElement inputPassword=wd.findElement(By.xpath("//input[2]"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys(incorrectPassword);

        WebElement loginBtn = wd.findElement(By.xpath("//button[1]"));
        loginBtn.click();

    }

    @Test
    public void LoginInputNegative3(){
        WebElement inputLogin= wd.findElement(By.xpath("//input[1]"));
        inputLogin.click();
        inputLogin.clear();
        inputLogin.sendKeys(emptyLogin);

        WebElement inputPassword=wd.findElement(By.xpath("//input[2]"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys(incorrectPassword);

        WebElement loginBtn = wd.findElement(By.xpath("//button[1]"));
        loginBtn.click();

    }

    @Test
    public void LoginInputNegative4(){
        WebElement inputLogin= wd.findElement(By.xpath("//input[1]"));
        inputLogin.click();
        inputLogin.clear();
        inputLogin.sendKeys(correctLogin);

        WebElement inputPassword=wd.findElement(By.xpath("//input[2]"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys(emptyPassword);

        WebElement loginBtn = wd.findElement(By.xpath("//button[1]"));
        loginBtn.click();

    }

    @AfterMethod
    public void postCondition() {
        System.out.println("Start postCondition");
        // wd.close();
        System.out.println("End postCondition");
    }
}
