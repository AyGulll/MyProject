package Rossmann;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
     public static WebDriver driver;
       @Test(dataProvider="UserData", groups={"Smoke","Login"});
       public void login(String username, String password){
           driver=new ChromeDriver();
           driver.get("https://www.rossmann.pl/");
       }
}
