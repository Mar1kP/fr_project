package page;

import framework_test.Base_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Base_page {
    public WebDriver driver;
    public WebDriverWait wait;

    public Base_page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void waitVisib(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click(By elementBy){
        waitVisib(elementBy);
        driver.findElement(elementBy).click();
    }
    public void input(By elementBy){
        waitVisib(elementBy);
        driver.findElement(elementBy).sendKeys();
    }

    public void isDisp(By elementBy){
        waitVisib(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

}
