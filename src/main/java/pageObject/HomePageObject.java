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
     WebElement btn_registerNow;

    @FindBy(xpath="//div[@class='modal-content']//button[@class='close']")
    WebElement btn_modalClose;

   @FindBy(xpath="//nav//ul//li//a[text()='Practice']")
   WebElement nav_Practice;
   public void clickOnRegisterNow(){
       btn_registerNow.click();
   }

     public void closePopup(){
      // driver.switchTo().alert();
       btn_modalClose.click();
     }

     public  void clickOnPractice(){
       nav_Practice.click();
     }
}
