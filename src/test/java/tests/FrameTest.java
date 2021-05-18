package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import testConstans.ITestConstans;
public class FrameTest extends BaseTest implements ITestConstans {
    @Test
    public void getTextInIFrameTest(){
        frame.openPage();
        frame.waitForPageOpened();
        frame.clickOnHyperLink();
        Assert.assertEquals(frame.getTextInIFrame(),"Your content goes here.");
    }
}
