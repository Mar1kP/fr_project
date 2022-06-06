package framework_test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class Fourth_test extends Base_test{
    @Severity(SeverityLevel.MINOR)
    @Description("we will test video mode button")
    @Story("test video button")
    @Test
    public void test4(){
        main.goTo();
        test_4.chooseVideoButton();
        //test_4.choosePlayButton();

    }
}
