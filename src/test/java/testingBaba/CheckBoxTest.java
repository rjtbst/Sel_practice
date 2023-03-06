package testingBaba;

import org.testng.annotations.Test;
import testBase.BaseTest;

public class CheckBoxTest extends BaseTest {
    @Test()
    public void checkBoxTest(){
        practice_page.clickOnCheckBox();
        System.out.println("click on check box");
        practice_page.selectBothCheckbox();

    }
}
