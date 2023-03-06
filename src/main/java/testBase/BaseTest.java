package testBase;

import com.utils.owner.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObject.HomePageObject;
import pageObject.PracticePageObject;
import java.time.Duration;

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
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }
    @BeforeTest
    public static void testSetup(){
        launchAndNavigate();
        System.out.println("driver is navigated to the url");
        home_page = new HomePageObject();
        home_page.closePopup();
        System.out.println("pop up closed");
        home_page.clickOnPractice();
        practice_page = new PracticePageObject();
       practice_page.clickOnElementsBtn();
    }
    @AfterTest
    public static void tearDown()
    {
        driver.quit();
    }
}
