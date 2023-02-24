package testingBaba;
import com.utils.zerocell.ReadExcel;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.PracticeFormPageObject;
import testBase.BaseTest;


public class PracticeTest extends BaseTest {
    @DataProvider
    public Object[][] getData(){
      return ReadExcel.getTestData("td_status","sheet1");
   }


    @Test
    public void verifyTextBox() throws InterruptedException {
        practiceForm.clickOnElementsBtn();
        practiceForm.clickOnTextBox();
        practiceForm.enterFullName("rajat lkdsfjl");
        practiceForm.enterEmail("ejf@ff.com");
        practiceForm.enterCurrentAddress("sdffsld");
        practiceForm.enterPermanentAddress("dsfsfdkjhskjdkfhkdkh");
        practiceForm.clickOnSubmit();

    }
}
