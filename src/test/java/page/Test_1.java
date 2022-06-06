package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_1 extends Base_page{

    public Test_1(WebDriver driver) {
        super(driver);
    }

    public void checkLogPageIsCorrect(){
        isDisp(By.xpath("//h1[text()='Log in']"));
    }
}
