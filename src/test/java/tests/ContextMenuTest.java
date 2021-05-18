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
        contextMenu.waitAlert();
        Assert.assertTrue(contextMenu.isDialogPresent(driver));
    }
    @Test
    public void alertMessageTest(){
        contextMenu.openPage();
        contextMenu.waitForPageOpened();
        contextMenu.rightMouseClick();
        contextMenu.waitAlert();
        Assert.assertEquals(contextMenu.alertMessage(),"You selected a context menu");
    }
    @Test
    public void closeAlertTest(){
        contextMenu.openPage();
        contextMenu.waitForPageOpened();
        contextMenu.rightMouseClick();
        contextMenu.waitAlert();
        contextMenu.closeAlert();
        Assert.assertFalse(contextMenu.isDialogPresent(driver));
    }
}
