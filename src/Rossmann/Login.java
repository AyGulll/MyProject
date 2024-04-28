package Rossmann;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends BaseDriver {
    public static WebDriver driver;


        @Test
        public void LoginTest(){
    }

    {
           driver=new ChromeDriver();
           driver.get("https://www.rossmann.pl/");
           driver.manage().window().maximize();
           MyFunction.Bekle(2);
           WebElement profil=driver.findElement(By.xpath("//span[normalize-space()='Profil']"));
           profil.click();
           WebElement login=driver.findElement(By.xpath("//font[contains(text(),'Hesab yarat')]"));
           login.click();
           WebElement createaccount=driver.findElement(By.xpath("//font[contains(text(),'Hesab yarat')]"));
           createaccount.click();
           WebElement mailadress=driver.findElement(By.xpath("//input[@id='email']"));
           mailadress.sendKeys("abilovaygul@gmail.com");
           WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
           password.sendKeys("YXt4_A@s-CYK!6g");
           WebElement clickbutton=driver.findElement(By.xpath("//section[@class='register-info']//label[1]//span[1]"));
           clickbutton.click();
           WebElement clicckbutton2=driver.findElement(By.xpath("//label[2]//span[1]"));
           clicckbutton2.click();
           WebElement robot=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
           robot.click();
           WebElement hesabyarat=driver.findElement(By.xpath("//font[contains(text(),'Hesab yarat')]"));
           hesabyarat.click();
           WebElement parolhatirla=driver.findElement(By.xpath("//button[@class='btn \tbtn-primary \t \t \t \t \t \tmb-2']"));
           parolhatirla.click();

       }

}
