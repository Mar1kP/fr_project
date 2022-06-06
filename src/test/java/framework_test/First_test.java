package framework_test;


import io.qameta.allure.*;
import org.junit.jupiter.api.Test;


public class First_test extends Base_test{

    @Severity(SeverityLevel.MINOR)
    @Description("we will test login button")
    @Story("test login button")
    @Test
    public void test1(){
        main.goTo();
        main.chooseLoginButton();
        test_1.checkLogPageIsCorrect();
    }




}
