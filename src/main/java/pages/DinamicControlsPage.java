package pages;
import constans.IConstans;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DinamicControlsPage extends BasePage implements IConstans {
    public DinamicControlsPage(WebDriver driver){
        super(driver);
    }
    public static final By CHECKBOX_LOCATOR = By.xpath("//*[@type='checkbox']");
    public static final By INPUT_LOCATOR = By.xpath("//*[@type='text']");
    public static final By REMOVE_BUTTON_LOCATOR = By.xpath("//*[@id='checkbox-example']/button[@type='button']");
    public static final By MESSAGE_LOCATOR = By.xpath("//*[@id='message']");
    public static final By ENABLE_BUTTON_LOCATOR = By.xpath("//*[@id='input-example']/button[@type='button']");
    /**
     * open Page "https://the-internet.herokuapp.com/dynamic_controls"
     */
    public void openPage() {
        driver.get(HEROKUAPP_DYNAMIC_CONTROL_URL);
    }
    /**
     * Checkbox exists or not
     * @return true if exists
     */
    public boolean isCheckboxExists(){
        return driver.findElements(CHECKBOX_LOCATOR).size() != 0;
    }
    /**
     * click Remove Button
     */
    public void clickRemoveButton(){
        driver.findElement(REMOVE_BUTTON_LOCATOR).click();
    }
    /**
     * wait for message text
     */
    public void waitForText() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MESSAGE_LOCATOR));
    }
    /**
     * sEnable Input or not
     * @return true if enable
     */
    public boolean isEnableInput(){
        return driver.findElement(INPUT_LOCATOR).isEnabled();
    }
    /**
     * Input exists or not
     * @return true if exists
     */
    public boolean isInputExists(){
        return driver.findElements(INPUT_LOCATOR).size() != 0;
    }
    /**
     * click Enable Button
     */
    public void clickEnableButton(){
        driver.findElement(ENABLE_BUTTON_LOCATOR).click();
    }
}
