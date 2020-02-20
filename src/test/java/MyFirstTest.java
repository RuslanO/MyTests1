import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;



public class MyFirstTest extends TestCaseSettings {

    @Test
    public void test() throws InterruptedException {
        webDriver.get("https://yandex.ru/");
        Thread.sleep(5000);
        String title = webDriver.getTitle();
        Assert.assertEquals("Яндекс", title);
    }



    @Test
    public void test2() throws InterruptedException {
        webDriver.get("https://yandex.ru/");
        Thread.sleep(3000);
        webDriver.findElement(By.tagName("a")).click();
        Thread.sleep(5000);
        webDriver.findElement(By.id("passp-field-login")).sendKeys("r-oliftaev@yandex.ru");
        webDriver.findElement(By.tagName("button")).submit();
        Thread.sleep(2000);
        webDriver.findElement(By.id("passp-field-passwd")).sendKeys("yandex20022020");
        webDriver.findElement(By.tagName("button")).submit();
        Thread.sleep(5000);
        String login = webDriver.findElement(By.className("mail-User-Name")).getText();
        Assert.assertEquals("r.oliftaev",login);


    }

}
