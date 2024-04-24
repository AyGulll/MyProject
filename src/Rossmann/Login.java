package Rossmann;

import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
     public static WebDriver driver;
       @Test(dataProvider="UserData", groups={"Smoke","Login"})
       public void login(String username, String password){
           driver=new ChromeDriver();
           driver.get("https://www.rossmann.pl/");
           driver.manage().window().maximize();
           MyFunc.Bekle(2);
           WebElement profil=driver.findElement(By.xpath("//span[normalize-space()='Profil']"));
           profil.click();
           WebElement login=driver.findElement(By.xpath("//font[contains(text(),'Hesab yarat')]"));
           login.click();
           WebElement button=driver.findElement(By.xpath(""));
           button.click();
       }

}
