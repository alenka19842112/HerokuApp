package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.DynamicControlsPage;
import pages.FramePage;
import pages.UploadPage;

public class BaseTest {
    WebDriver driver;
    ContextMenuPage contextMenu;
    FramePage frame;
    UploadPage upload;
    DynamicControlsPage dynamicControls;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        contextMenu = new ContextMenuPage(driver);
        dynamicControls = new DynamicControlsPage(driver);
        frame = new FramePage(driver);
        upload = new UploadPage(driver);
        driver.manage().window().maximize();
    }

    @AfterTest(alwaysRun = true)
    public void endTest() {
        driver.quit();
    }
}
