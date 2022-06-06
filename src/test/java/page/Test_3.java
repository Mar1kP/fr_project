package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_3 extends Base_page{

    public Test_3(WebDriver driver) {
        super(driver);
    }

    public void checkExeButton(){
        isDisp(By.xpath("//span[text()='Выбрать язык']"));
    }
    public void chooseModeButton(){
        click(By.xpath("//a[@class='w3-bar-item w3-button bar-icon-hover w3-right w3-hide-small']"));
    }
    public void chooseDarkButton(){
        click(By.id("radio_darkcode"));
    }
}
