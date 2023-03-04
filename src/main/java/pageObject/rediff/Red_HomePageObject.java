package pageObject.rediff;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTestRediff;

public class Red_HomePageObject extends BaseTestRediff {
    public Red_HomePageObject() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@id='signin_info']//a[text()='Create Account']")
    WebElement lnk_createAccount;

    public void clickOnCreateAccount() {
        lnk_createAccount.click();
    }

}