package pages;
import constans.IConstans;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
public class UploadPage extends BasePage implements IConstans {
    public UploadPage(WebDriver driver){
        super(driver);
    }
    public static final String RELATIVE_PATH = "src/test/resources/1 - дз.pdf";
    public static final By UPLOAD_BUTTON_LOCATOR = By.xpath("//*[@id='file-submit']");
    public static final By FILE_UPLOADED_LOCATOR = By.xpath("//*[@id='uploaded-files']");
    /**
     * open Page "https://the-internet.herokuapp.com/upload"
     */
    public void openPage() {
        driver.get(HEROKUAPP_UPLOAD_URL);
    }
    /**
     * upload file
     */
    public void uploadFile(){
        File file = new File(RELATIVE_PATH);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(file.getAbsolutePath());
        driver.findElement(UPLOAD_BUTTON_LOCATOR).click();
    }
    /**
     * get text uploaded file
     * @return uploaded file's name
     */
    public String getTextUploadedFile(){
        return driver.findElement(FILE_UPLOADED_LOCATOR).getText();
    }
    /**
     * wait For Page "https://the-internet.herokuapp.com/upload" Opened
     */
    public void waitForPageOpened() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(FILE_UPLOADED_LOCATOR));
    }
}
