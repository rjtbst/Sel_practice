package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTest;

public class HomePageObject extends BaseTest {
    public HomePageObject() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Register Now')]")
    private WebElement btn_registerNow;

    @FindBy(xpath="//div[@class='modal-content']//button[@class='close']")
    private WebElement btn_modalClose;

   @FindBy(xpath="//nav//ul//li//a[text()='Practice']")
   private WebElement anc_Practice;
   public void clickOnRegisterNow(){
       btn_registerNow.click();
   }

     public void closePopup(){
       btn_modalClose.click();
     }

     public void clickOnPractice(){
       anc_Practice.click();
     }
}
