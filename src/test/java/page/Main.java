package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.Signature;

public class Main extends Base_page{
    String SITE_URL = "https://www.w3schools.com/";
    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo(){
        driver.get(SITE_URL);
    }

    public void chooseLoginButton(){
        click(By.id("w3loginbtn"));
    }



    /*public void chooseCurLeng(){
        click(By.xpath("//span[text()='украинский']"));
    }*/


}
