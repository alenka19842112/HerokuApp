package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAppAddRemoveTest {
    @Test
    public void herokuAppAddRemoveTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//*[@onclick='deleteElement()']")).click();
        int actualCount = driver.findElements(By.xpath("//*[@onclick='deleteElement()']")).size();

        Assert.assertEquals(actualCount,1);

        driver.quit();

    }
}
