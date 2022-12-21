package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsMethods {

    public static void click (WebDriver driver, By by, int wait) {
        WebElement element = (new WebDriverWait(Drivers.driver, Duration.ofSeconds(wait)))
                .until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }

    public WebElement formData (WebDriver driver, By by, String information, int wait) {
        WebDriverWait waitElement = new WebDriverWait(driver, Duration.ofSeconds(wait));
        waitElement.until(ExpectedConditions.elementToBeClickable(by));
        WebElement element = driver.findElement(by);

        element.sendKeys(information);
        return element;
    }
}
