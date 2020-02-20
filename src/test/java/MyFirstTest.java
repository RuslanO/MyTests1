import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.List;
import java.util.Set;
public class MyFirstTest {

    private WebDriver webDriver;

    @Before
    public void init(){
        System.setProperty("webdriver.gecko.driver","C:/Drivers/geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        webDriver.get("https://mail.ru/");
        Thread.sleep(3000);
    }

    @After
    public void after(){
        webDriver.quit();
    }
}
