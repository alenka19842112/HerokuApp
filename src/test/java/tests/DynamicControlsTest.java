package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testConstans.ITestConstans;

public class DynamicControlsTest extends BaseTest implements ITestConstans {

    @Test
    public void checkboxTest(){
        dynamicControls.openPage();
        dynamicControls.clickRemoveButton();
        dynamicControls.waitForTextVisible();
        Assert.assertFalse(dynamicControls.isCheckboxExists());
    }

    @Test
    public void inputTest(){
        dynamicControls.openPage();
        dynamicControls.isInputExists();
        dynamicControls.isInputEnabled();
        dynamicControls.clickEnableButton();
        dynamicControls.waitForTextVisible();
        Assert.assertTrue(dynamicControls.isInputEnabled());
    }
}
