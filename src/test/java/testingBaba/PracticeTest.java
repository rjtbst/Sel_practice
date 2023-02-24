package testingBaba;
import com.utils.zerocell.ReadExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.BaseTest;

public class PracticeTest extends BaseTest {

   @DataProvider
    public Object[][] getData(){
      return ReadExcel.getTestData("td_status","sheet1");
   }

    @Test(dataProvider = "getData")
    void validateElements(String status, String expectedStatus){
       homePage.closePopup();
        homePage.clickOnPractice();
    }
}
