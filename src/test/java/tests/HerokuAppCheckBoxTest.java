package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HerokuAppCheckBoxTest {
    @Test
    public void herokuAppCheckBox1Test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        List<WebElement> checkBoxesList = driver.findElements(By.cssSelector("input[type='checkbox']"));
        checkBoxesList.get(0).click();
        boolean isFirstCheckboxSelected = checkBoxesList.get(0).isSelected();

        Assert.assertTrue(isFirstCheckboxSelected);

        driver.quit();

    }

    @Test
    public void herokuAppCheckBox2Test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> checkBoxesList = driver.findElements(By.cssSelector("input[type='checkbox']"));
        checkBoxesList.get(1).click();
        boolean isSecondCheckboxSelected = checkBoxesList.get(1).isSelected();

        Assert.assertFalse(isSecondCheckboxSelected);

        driver.quit();

    }
}
