package pages;
import constans.IConstans;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FramePage extends BasePage implements IConstans {
    public FramePage(WebDriver driver) {
        super(driver);
    }
    public static final By FRAME_LINK_LOCATOR = By.xpath("//*[@href='/iframe']");
    public static final By FRAME_LOCATOR = By.xpath("//*[@id='tinymce']");
    public static final String FRAME_ID = "mce_0_ifr";
    /**
     * open Page "https://the-internet.herokuapp.com/frames"
     */
    public void openPage() {
        driver.get(HEROKUAPP_FRAME_URL);
    }
    /**
     * click on frame Hyper Link
     */
    public void clickOnHyperLink(){
        driver.findElement(FRAME_LINK_LOCATOR).click();
    }
    /**
     *  get Text In Frame
     * @return text in Frame
     */
    public String getTextInIFrame() {
        driver.switchTo().frame(FRAME_ID);
        String textIFrame = driver.findElement(FRAME_LOCATOR).getText();
        driver.switchTo().defaultContent();
        return textIFrame;
    }
    /**
     * wait For Page "https://the-internet.herokuapp.com/frames" Opened
     */
    public void waitForPageOpened() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(FRAME_LINK_LOCATOR));
    }
}
