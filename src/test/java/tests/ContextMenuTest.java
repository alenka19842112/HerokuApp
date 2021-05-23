package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testConstans.ITestConstans;

public class ContextMenuTest extends BaseTest implements ITestConstans {

    @Test
    public void rightMouseClickTest() {
        contextMenu.openPage();
        contextMenu.waitForPageOpened();
        contextMenu.rightMouseClick();
        contextMenu.waitForAlertIsPresent();
        Assert.assertTrue(contextMenu.isDialogPresent(driver));
    }

    @Test
    public void alertMessageTest(){
        contextMenu.openPage();
        contextMenu.waitForPageOpened();
        contextMenu.rightMouseClick();
        contextMenu.waitForAlertIsPresent();
        Assert.assertEquals(contextMenu.getAlertMessage(),"You selected a context menu");
    }

    @Test
    public void closeAlertTest(){
        contextMenu.openPage();
        contextMenu.waitForPageOpened();
        contextMenu.rightMouseClick();
        contextMenu.waitForAlertIsPresent();
        contextMenu.closeAlert();
        Assert.assertFalse(contextMenu.isDialogPresent(driver));
    }
}
