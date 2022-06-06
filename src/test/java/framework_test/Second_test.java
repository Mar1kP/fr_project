package framework_test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class Second_test extends Base_test {

    @Severity(SeverityLevel.MINOR)
    @Description("we will test language button")
    @Story("test language button")
    @Test
    public void test2(){
        main.goTo();
        test_2.chooseLangButton();
        test_2.checkLangButton();
        test_2.chooseLang();
        //main.chooseCurLang();
    }
}
