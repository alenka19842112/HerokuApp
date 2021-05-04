package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAppDropDownTest {

    @Test
    public void herokuAppDropDownAllOptionsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Select select = new Select(driver.findElement(By.id("dropdown")));
        int countOfOptions = select.getOptions().size();

        Assert.assertEquals(countOfOptions, 3);

        driver.quit();
    }

    @Test
    public void herokuAppDropDownOption1Test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");

        String actualText = select.getFirstSelectedOption().getText();

        Assert.assertEquals(actualText, "Option 1");

        driver.quit();
    }

    @Test
    public void herokuAppDropDownOption2Test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 2");
        String actualText = select.getOptions().get(2).getText();

        Assert.assertEquals(actualText, "Option 2");
        driver.quit();
    }

}
