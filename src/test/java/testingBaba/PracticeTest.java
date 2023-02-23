package testingBaba;

import org.testng.annotations.Test;
import testBase.BaseTest;

public class PracticeTest extends BaseTest {

    @Test
    void validateElements(){
        homePage.closePopup();
        homePage.clickOnPractice();

    }
}
