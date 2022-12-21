package Page;

import Utilities.ActionsMethods;
import org.openqa.selenium.*;

public class VisaCardCartPage extends ActionsMethods {
    private WebDriver driver;

    public VisaCardCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public static final By inputName = By.id("name");
    public static final By inputCountry = By.id("country");
    public static final By inputCity = By.id("city");
    public static final By inputCard = By.id("card");
    public static final By inputMonth = By.id("month");
    public static final By inputYear = By.id("year");
    public static final By clickPurchase = By.xpath("//button[@onclick=\"purchaseOrder()\"]");
    public static final By validationName = By.xpath("//*[text() = \"Name: Percy Clayton\"]");
    public static final By valuePaid = By.xpath("//*[text() = \"Amount: 1100 USD\"]");
    public static final By valueID = By.xpath("//*[contains(text(), \"Id: \")]");
    public void forms() {
        click(driver, inputName, 5 );
        formData(driver, inputName, "Percy Clayton", 0);

        click(driver, inputCountry, 5 );
        formData(driver, inputCountry, "United States", 0);

        click(driver, inputCity, 5 );
        formData(driver, inputCity, "Jacksonville", 0);

        click(driver, inputCard, 5 );
        formData(driver, inputCard, "4411732769254916", 0);

        click(driver, inputMonth, 5 );
        formData(driver, inputMonth, "4", 0);

        click(driver, inputYear, 5 );
        formData(driver, inputYear, "2029", 0);

        click(driver,clickPurchase, 0 );

        click(driver, valueID, 1);
        System.out.println("Result: " + valueID);

        click(driver, validationName, 1);
        System.out.println("Result: " + validationName);

        click(driver, valuePaid, 1);
        System.out.println("Result: " + valuePaid);

    }
}
