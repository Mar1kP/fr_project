package framework_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.*;

import java.util.concurrent.TimeUnit;

public class Base_test {
    //String SITE_URL = "https://www.w3schools.com/";
    WebDriver driver;
    public Main main;
    public Test_1 test_1;
    public Test_2 test_2;
    public Test_3 test_3;
    public Test_4 test_4;
    public Test_5 test_5;

    @Epic("Test framework w3school")

    /*@BeforeClass
    @Parameters("browsers")
    public void initialization(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.setHeadless(true);
            driver = new FirefoxDriver(options);
        } else if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(true);
            driver = new ChromeDriver(options);
        }
    }
    */

    @BeforeEach
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        test_1 = PageFactory.initElements(driver, Test_1.class);
        test_2 = PageFactory.initElements(driver, Test_2.class);
        test_3 = PageFactory.initElements(driver, Test_3.class);
        test_4 = PageFactory.initElements(driver, Test_4.class);
        test_5 = PageFactory.initElements(driver, Test_5.class);

    }


}
