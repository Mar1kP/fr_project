package framework_test.cross;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class CrossBaruser_test {
    WebDriver driver;
    final String SITE_URL = "https://profile.w3schools.com/";
    Set<Cookie> cookies;

    @BeforeClass
    @Parameters("browser")
    public void initialization(String browser) {
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();

            driver = new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();

            driver = new ChromeDriver(options);
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(SITE_URL);
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                driver.manage().addCookie(cookie);
            }
        }
    }
    @Test()
    public void testOne() {
        driver.get(SITE_URL);
        driver.findElement(By.id("modalusername")).sendKeys("pigruhm@gmail.com");
        driver.findElement(By.id("current-password")).sendKeys("67Guturo");
        driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']"))
                .click();
        cookies = driver.manage().getCookies();
    }

    @Test()
    public void testTwo() {
        driver.get(SITE_URL);
        driver.findElement(By.id("modalusername")).sendKeys("log1");
        driver.findElement(By.id("current-password")).sendKeys("pass1");
        driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']"))
                .click();
        cookies = driver.manage().getCookies();
    }

}
