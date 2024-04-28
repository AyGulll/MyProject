package Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriver wait;
    static {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = (WebDriver) new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public static void BekleVeKapat(){
        MyFunction.Bekle(5);
        driver.quit();
        driver.close();
    }

}


