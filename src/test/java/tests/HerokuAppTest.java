package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HerokuAppTest {

    @Test
    public void herokuAppInputTest(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); //путь к драйверу хром
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//размер окна
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //ожидание загрузки элемента для findelement следующие за ним
        driver.get("http://the-internet.herokuapp.com/inputs");//зайти на страницу

        WebElement inputField = driver.findElement(By.xpath("//*[@type='number']"));
        inputField.sendKeys("20");
        String actualText = inputField.getAttribute("value");
        //driver.findElement(By.xpath("//*[@type='number']")).sendKeys("20"); //заменили на стр 26-27
       // String actualText = driver.findElement(By.xpath("//*[@type='number']")).getAttribute("value");// заменили стр 28

        Assert.assertEquals(actualText,"20"); //проверка актуального и ожидаемого значения

       /* inputField.sendKeys(Keys.ARROW_UP); //ввод значения +1
        actualText = inputField.getAttribute("value");

        Assert.assertEquals(actualText,"21");*/

        driver.quit();
    }



}
