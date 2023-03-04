package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class PracticePageObject extends BaseTest {
    public PracticePageObject(){
        PageFactory.initElements(driver,this);
    }
   //------------------textBox----------------------//
   @FindBy(xpath = "//div[@id=\"elements-accordion\"]//button[@data-target='#elements']")
    WebElement btn_Elements;
    @FindBy(xpath = "//*[@id=\"v-pills-tab\"]/a[text()='text box']")
   WebElement btn_TextBox;
    @FindBy(xpath = "//div[@id='bannertitle']")
   WebElement txt_bannerTitle;
    @FindBy(xpath = "//form//input[@id='fullname1']")
   WebElement inp_fullName;
    @FindBy(xpath = "//form//input[@id='fullemail1']")
   WebElement inp_email;
    @FindBy(xpath = "//form//textarea[@id='fulladdresh1']")
   WebElement inp_currentAddress;
    @FindBy(xpath = "//form//textarea[@id='paddresh1']")
   WebElement inp_permAddress;
    @FindBy(xpath="//div[@class='col-md-6 mt-5']/label")
    List<WebElement> txtList_AfterRegistered;
    @FindBy(xpath = "//*[@type='button' and @value='Submit']")
    WebElement inp_submitBtn;
    //----------------checkbox element--------------------------------------//
    @FindBy(xpath = "//a[text()='check box']")
    WebElement btn_checkBox;

    @FindBy(xpath="//div/label/following-sibling::input[@type='checkbox']")
    List<WebElement> checkBoxes;
    public void clickOnElementsBtn(){
      btn_Elements.click();
    }
    public void clickOnTextBox(){
        btn_TextBox.click();
    }

    public String getBannerTitle(){
     return txt_bannerTitle.getText();
    }
    public void enterFullName(String name){
        inp_fullName.sendKeys(name);
    }
    public void enterEmail(String email){
        inp_email.sendKeys(email);
    }
    public void enterCurrentAddress(String cAddress){
        inp_currentAddress.sendKeys(cAddress);
    }
    public void enterPermanentAddress(String pAddress){
        inp_permAddress.sendKeys(pAddress);
    }
    public void clickOnSubmit(){
        inp_submitBtn.click();
    }
    public List<String> getTextAfterSubmission(){
     List<String> formTextList = new ArrayList<>();
     for (int i= 1;i<txtList_AfterRegistered.size();i+=2){
      formTextList.add(txtList_AfterRegistered.get(i).getText());
     }
     return formTextList;
    }

    public void clearFormData(){
     inp_fullName.clear();
     inp_email.clear();
     inp_currentAddress.clear();
     inp_permAddress.clear();
    }
    public void clickOnCheckBox(){
     btn_checkBox.click();
    }
    public void selectBothCheckbox(){
     //check if visible then click on both
     for(WebElement ch: checkBoxes){
      ch.click();}
    }


}
