package testBase;

import com.utils.owner.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObject.HomePageObject;
import pageObject.RegistrationFormPage;

public class BaseTest extends ObjectsRepo {
    public static WebDriver driver;
    static FrameworkConfig fwConfig = ConfigFactory.create(FrameworkConfig.class);
    static String browser = fwConfig.browser();
    static String url = fwConfig.url();

    public static void launchAndNavigate(){

        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else {
            System.out.println("wrong choice of browser");
        }
        driver.get(url);
        driver.manage().window().maximize();
    }
    @BeforeMethod
    private static void testSetup(){
    launchAndNavigate();
    homePage = new HomePageObject();
        System.out.println("home: "+homePage);
        registrationPage = new RegistrationFormPage();
    }
    @AfterMethod
    private static void tearDown(){
        driver.quit();
    }

}
