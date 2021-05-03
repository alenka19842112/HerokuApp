package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class HerokuAppCheckBoxTest {
    @Test
    public void herokuAppCheckBox1Test(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> CheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        if (!CheckBoxes.get(0).isSelected()) {
            CheckBoxes.get(0).click();
        }

        Assert.assertTrue(CheckBoxes.get(0).isSelected());

        driver.quit();

    }

    @Test
    public void herokuAppCheckBox2Test(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> CheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        if (CheckBoxes.get(1).isSelected()) {
            CheckBoxes.get(1).click();
        }

        Assert.assertFalse(CheckBoxes.get(1).isSelected());

        driver.quit();

    }
}
