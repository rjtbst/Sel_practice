package testingBaba;
import com.utils.zerocell.ReadExcel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.BaseTest;

import java.util.List;


public class PracticeFormTest extends BaseTest {
//    @DataProvider
//    public Object[][] getData(){
//      return ReadExcel.getTestData("td_status","sheet1");
//   }

    @DataProvider
    public Object[][] getFormData(){return ReadExcel.getTestData("td_formToTxt","Sheet1");}


    @AfterMethod
    public static void before(){
    practiceForm.clearFormData();
}
    @Test(dataProvider = "getFormData")
    public void verifyTextBox(String name, String email, String cAdd, String pAdd) {
        practiceForm.enterFullName(name);
        practiceForm.enterEmail(email);
        practiceForm.enterCurrentAddress(cAdd);
        practiceForm.enterPermanentAddress(pAdd);
        practiceForm.clickOnSubmit();
       List<String> allText = practiceForm.getTextAfterSubmission();
        String expectedName = allText.get(0);
        String expectedEmail = allText.get(1);
        String expectedCAdd = allText.get(2);
        String expectedPAdd = allText.get(3);
        Assert.assertEquals(name,expectedName);
        Assert.assertEquals(email,expectedEmail);
        Assert.assertEquals(cAdd,expectedCAdd);
        Assert.assertEquals(pAdd,expectedPAdd);

    }
}
