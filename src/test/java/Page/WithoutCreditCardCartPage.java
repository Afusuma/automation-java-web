package Page;

import Utilities.ActionsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithoutCreditCardCartPage extends ActionsMethods {
    private WebDriver driver;

    public WithoutCreditCardCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public static final By clickPurchase = By.xpath("//button[@onclick=\"purchaseOrder()\"]");

    public void forms() throws InterruptedException {
        click(driver,clickPurchase, 5 );
        Thread.sleep(1000);
        String text = driver.switchTo().alert().getText();
        System.out.println("Alert text is: " + text);
        text.equals("Please fill out Name and Creditcard.");
    }
}
