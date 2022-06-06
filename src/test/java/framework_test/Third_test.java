package framework_test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class Third_test extends Base_test{
    @Severity(SeverityLevel.MINOR)
    @Description("we will test dark mode button")
    @Story("test dark mode button")
    @Test
    public void test3(){
        main.goTo();
        test_3.chooseModeButton();
        test_3.chooseDarkButton();

    }
}
