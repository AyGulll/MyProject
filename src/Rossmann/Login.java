package Rossmann;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Login {
     public static WebDriver driver;
       @Test(dataProvider="UserData", groups={"Smoke","Login"});
}
