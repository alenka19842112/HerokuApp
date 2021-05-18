package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import testConstans.ITestConstans;
public class UploadTest extends BaseTest implements ITestConstans {
    @Test
    public void getTextUploadedFileTest(){
        upload.openPage();
        upload.uploadFile();
        upload.waitForPageOpened();
        Assert.assertEquals(upload.getTextUploadedFile(),"1 - дз.pdf");
    }
}
