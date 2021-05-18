package tests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import testConstans.ITestConstans;
public class DinamicControlsTest extends BaseTest implements ITestConstans {
    @Test
    public void checkboxTest(){
        dinamicControls.openPage();
        dinamicControls.clickRemoveButton();
        dinamicControls.waitForText();
        Assert.assertFalse(dinamicControls.isCheckboxExists());
    }
    @Test
    public void inputTest(){
        dinamicControls.openPage();
        dinamicControls.isInputExists();
        dinamicControls.isEnableInput();
        dinamicControls.clickEnableButton();
        dinamicControls.waitForText();
        Assert.assertTrue(dinamicControls.isEnableInput());
    }
}
