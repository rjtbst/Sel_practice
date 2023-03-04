package pageObject.rediff;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTestRediff;

public class Red_RegisterPageObject extends BaseTestRediff {
    public Red_RegisterPageObject() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//td[text()='Full Name']/following-sibling::td/input")
    WebElement inp_FullName;
    @FindBy(xpath = "//td[text()='Choose a Rediffmail ID']/following-sibling::td/input")
    WebElement inp_ChooseMailId;
    @FindBy(xpath = "//td[text()='Choose a Rediffmail ID']/following-sibling::td/input[@value='Check availability']")
    WebElement inp_CheckAvailability;
    @FindBy(xpath = "//div[@id='recommend_text']//tr[1]//input[@id='radio_login']")
    WebElement radio_firstSuggestedMail;
    @FindBy(xpath = "//td[text()='Password']/following-sibling::td/input")
    WebElement inp_Password;
    @FindBy(xpath = "//td[text()='Retype password']/following-sibling::td/input")
    WebElement inp_RetypePassword;
    @FindBy(xpath = "//td[text()='Alternate Email Address']/following-sibling::td/input")
    WebElement inp_AlternateMail;
    @FindBy(xpath = "//input[@id='mobno']")
    WebElement inp_mobNum;
    @FindBy(xpath = "//input[@id='Register' and @type='submit']")
    WebElement inp_submitbtn;
    public void enterFullName(String fullname) {
        inp_FullName.sendKeys(fullname);
    }
    public void enterEmail(String chooseMailId) {
        inp_ChooseMailId.sendKeys(chooseMailId);
        inp_CheckAvailability.click();
    }
    public boolean isEmailAvailable(){
        return !radio_firstSuggestedMail.isDisplayed();
    }
    public void clickOnSuggestedMail(){
        radio_firstSuggestedMail.click();
    }
    public void enterPassword(String password){
        inp_Password.sendKeys(password);
    }
    public void enterRetypePassword(String retypePass){
        inp_RetypePassword.sendKeys(retypePass);
    }

    public void enterAlternateEmail(String alternateEmail){
        inp_AlternateMail.sendKeys(alternateEmail);
    }

    public void enterMobileNumber(String phone){
        inp_mobNum.sendKeys(phone);
    }

    public void clickOnSubmit(){
        inp_submitbtn.click();
    }

}