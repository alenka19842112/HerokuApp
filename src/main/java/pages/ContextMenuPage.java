package pages;

import constans.IConstans;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMenuPage extends BasePage implements IConstans {
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public static final By CONTEXT_MENU_LOCATOR = By.xpath("//*[@id='hot-spot']");

    /**
     * open Page "https://the-internet.herokuapp.com/context_menu"
     */
    public void openPage() {
        driver.get(HEROKUAPP_CONTEXT_MENU_URL);
    }

    /**
     * wait For Page "https://the-internet.herokuapp.com/context_menu" Opened
     */
    public void waitForPageOpened() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CONTEXT_MENU_LOCATOR));
    }

    /**
     * right mouse click
     */
    public void rightMouseClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(CONTEXT_MENU_LOCATOR)).build().perform();
    }

    /**
     * wait alert
     */
    public void waitForAlertIsPresent() {
        Alert alert = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.alertIsPresent());
    }

    /**
     * checks if an alert exists
     *
     * @param driver Webdriver
     * @return true if alert exists
     */
    public boolean isDialogPresent(WebDriver driver) {
        Alert alert = ExpectedConditions.alertIsPresent().apply(driver);
        return (alert != null);
    }

    /**
     * Capturing alert message
     *
     * @return alert message
     */
    public String getAlertMessage() {
        return driver.switchTo().alert().getText();
    }

    /**
     * Close alert
     */
    public void closeAlert() {
        driver.switchTo().alert().accept();
    }
}
