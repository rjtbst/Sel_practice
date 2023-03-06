package testBase;
import com.utils.owner.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import pageObject.rediff.Red_HomePageObject;
import pageObject.rediff.Red_RegisterPageObject;
import java.time.Duration;

public class BaseTestRediff extends ObjectsRepoRediff {
    public static WebDriver driver;
    static FrameworkConfig fwConfig = ConfigFactory.create(FrameworkConfig.class);
    static String browser = fwConfig.browser();
    static String newUrl = fwConfig.rediffUrl();
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
        driver.get(newUrl);
        driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @BeforeTest
    public static void testSetup(){
        launchAndNavigate();
        home_page = new Red_HomePageObject();
        register_page = new Red_RegisterPageObject();
    }
//    @AfterTest
//    public static void tearDown(){
//        driver.quit();
//    }
}
