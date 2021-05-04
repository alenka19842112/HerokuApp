package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAppInputTest {
    @Test
    public void herokuAppInputArrowUpTest() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputField = driver.findElement(By.xpath("//*[@type='number']"));

        inputField.sendKeys("1");
        inputField.sendKeys(Keys.ARROW_UP);
        String actualText = inputField.getAttribute("value");

        Assert.assertEquals(actualText, "2");

        driver.quit();
    }

    @Test
    public void herokuAppInputArrowDownTest() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputField = driver.findElement(By.xpath("//*[@type='number']"));

        inputField.sendKeys("1");
        inputField.sendKeys(Keys.ARROW_DOWN);
        String actualText = inputField.getAttribute("value");

        Assert.assertEquals(actualText, "0");

        driver.quit();
    }

}
