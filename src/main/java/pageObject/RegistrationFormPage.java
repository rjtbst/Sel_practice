package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTest;

import java.util.List;

public class RegistrationFormPage extends BaseTest {
    public RegistrationFormPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//form//label[@class='label']//following-sibling::input[@name='f_name']")
    WebElement inp_firstName;

    @FindBy(xpath = "//form//label[@class='label']//following-sibling::input[@name='l_name']")
    WebElement inp_lastName;

    @FindBy(xpath = "//form//label[@class='label']//following-sibling::div/input[@name='dob']")
    WebElement inp_dob;
    @FindBy(xpath = "//form//label[@class='label']//following-sibling::input[@id='email']")
    WebElement inp_email;

    @FindBy(xpath="//input[@name='gender']/parent::label")
    List<WebElement> rdo_gender;

    @FindBy(xpath = "//form//label[@class='label']//following-sibling::input[@id='mobile']")
    WebElement inp_mobileNum;

    @FindBy(xpath = "//form//label[@class='label']//following-sibling::input[@id='address']")
    WebElement inp_address;

    @FindBy(xpath = "//form//label[@class='label']//following-sibling::input[@id='city']")
    WebElement inp_city;
    @FindBy(xpath = "//select[@id='course']")
    WebElement select_course;


}

