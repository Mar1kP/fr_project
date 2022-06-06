package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_4 extends Base_page{

    public Test_4(WebDriver driver) {
        super(driver);
    }

    public void chooseVideoButton(){
        click(By.xpath("//a[@class='w3-bar-item w3-button w3-hide-medium bar-item-hover " +
                "w3-hide-small w3-padding-24 barex ws-hide-1200']"));
    }
    public void choosePlayButton(){
        click(By.xpath("//a[@class='my-video_youtube_api']"));
    }


}
