package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_5 extends Base_page{

    public Test_5(WebDriver driver) {
        super(driver);
    }

    public void chooseQuizButton(){
        click(By.xpath("//a[@class='w3-button exercise-button w3-round ws-yellow hover-yellow']"));
    }
    public void choosePythonButton(){
        click(By.xpath("//a[@title='Python Tutorial']"));
    }


}
