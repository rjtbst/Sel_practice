package rediff;

import org.testng.annotations.Test;
import testBase.BaseTestRediff;

public class VerifyLoginTest extends BaseTestRediff {
    @Test(priority = 1)
    public void registerUser() throws InterruptedException {
       home_page.clickOnCreateAccount();
       register_page.enterFullName("abcd efgh");
       register_page.enterEmail("abcd");
       Thread.sleep(3000);
       boolean available = register_page.isEmailAvailable();
       if (!available){
           register_page.clickOnSuggestedMail();
       }else{
       register_page.enterPassword("abcdefgh");
       register_page.enterRetypePassword("abcdefgh");
       register_page.enterAlternateEmail("esehi@mail.com");
       register_page.enterMobileNumber("1234567890");
       Thread.sleep(8000);
       register_page.clickOnSubmit();}
    }

    @Test(priority = 2)
    public void loginValidUser(){

    }
}
