package testingBaba;
import com.utils.dataFeeder.ReadExcel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.BaseTest;
import java.util.List;

public class TextboxTest extends BaseTest {

    @DataProvider
    public Object[][] getFormData(){
        return ReadExcel.getTestData("td_formToTxt","Sheet1");
    }
    @Test(priority = 1)
    public void gotoTextBox(){
        practice_page.clickOnTextBox();
       String actualBannerTitle = practice_page.getBannerTitle();
       Assert.assertEquals(actualBannerTitle,"text box");
        System.out.println(actualBannerTitle);
    }
    @Test(dataProvider = "getFormData",priority = 2)
    public void verifyTextBox(String name, String email, String cAdd, String pAdd) {
        practice_page.enterFullName(name);
        practice_page.enterEmail(email);
        practice_page.enterCurrentAddress(cAdd);
        practice_page.enterPermanentAddress(pAdd);
        practice_page.clickOnSubmit();
       List<String> allText = practice_page.getTextAfterSubmission();
        String actualName = allText.get(0);
        String actualEmail = allText.get(1);
        String actualCAdd = allText.get(2);
        String actualPAdd = allText.get(3);
        Assert.assertEquals(actualName,name);
        Assert.assertEquals(actualEmail,email);
        Assert.assertEquals(actualCAdd,cAdd);
        Assert.assertEquals(actualPAdd,pAdd);
        practice_page.clearFormData();
    }





}
