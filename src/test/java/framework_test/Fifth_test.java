package framework_test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class Fifth_test extends Base_test{
    @Severity(SeverityLevel.MINOR)
    @Description("we will test Quizzes button")
    @Story("test quizzes button")
    @Test
    public void test5(){
        main.goTo();
        test_5.chooseQuizButton();
        test_5.choosePythonButton();

    }
}
