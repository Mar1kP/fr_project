package framework_test.dataprovider_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Login_test {
    WebDriver driver;
    String SITE_URL = "https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";

    @BeforeMethod
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @DataProvider(name = "LoginDataProvider")
    public Object [][] getData(){
        Object [][] data = {{"pigruhm@gmail.com","67Guturo."},{ "log2","pass2"}};
        return data;
    }

    @Test(dataProvider ="LoginDataProvider" )
    public void tryLogin(String lg, String ps){
        driver.get(SITE_URL);
        driver.findElement(By.id("modalusername")).sendKeys(lg);
        driver.findElement(By.id("current-password")).sendKeys(ps);
        driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']"))
                .click();

    }
//---------------------------------------------------------------------------------------------
    @DataProvider(name = "LoginExcelDataProvider")
    public Object[][] excelData() throws IOException {
        return new ReadX().readExcel();
    }
    @Test(dataProvider = "LoginExcelDataProvider")
    public void tryXLogin(String lg, String ps){
        driver.get(SITE_URL);
        driver.findElement(By.id("modalusername")).sendKeys(lg);
        driver.findElement(By.id("current-password")).sendKeys(ps);
        driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']"))
                .click();

    }

}

