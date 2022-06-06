package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_2 extends Base_page{

    public Test_2(WebDriver driver) {
        super(driver);
    }

    public void checkLangButton(){
        isDisp(By.xpath("//span[text()='Выбрать язык']"));
    }
    public void chooseLangButton(){
        click(By.id("nav_translate_btn"));
    }

    public void chooseLang(){
        click(By.id(":0.targetLanguage"));
    }
}