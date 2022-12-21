package Page;

import Utilities.ActionsMethods;
import org.openqa.selenium.*;

public class AMEXCartPage extends ActionsMethods {
    private WebDriver driver;

    public AMEXCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public static final By clickCart = By.id("cartur");
    public static final By laptops = By.xpath("//a[@onclick=\"byCat('notebook')\"]");
    public static final By choiceMacBook = By.xpath("//*[text()=\"MacBook Pro\"]");
    public static final By addToCart = By.xpath("//a[@onclick=\"addToCart(15)\"]");
    public static final By clickPlaceOrder = By.xpath("//*[text()=\"Place Order\"]");
    public void addMacBookPro() throws InterruptedException {
        click(driver, laptops, 1 );
        click(driver, choiceMacBook, 1 );
        click(driver, addToCart, 1 );

        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        click(driver, clickCart, 1 );
        click(driver, clickPlaceOrder, 5 );
    }

    public static final By inputName = By.id("name");
    public static final By inputCountry = By.id("country");
    public static final By inputCity = By.id("city");
    public static final By inputCard = By.id("card");
    public static final By inputMonth = By.id("month");
    public static final By inputYear = By.id("year");
    public static final By clickPurchase = By.xpath("//button[@onclick=\"purchaseOrder()\"]");
    public static final By validationName = By.xpath("//*[text() = \"Name: John Doe\"]");
    public static final By valuePaid = By.xpath("//*[text() = \"Amount: 1100 USD\"]");
    public static final By valueID = By.xpath("//*[contains(text(), \"Id: \")]");
    public void forms() {
        click(driver, inputName, 5 );
        formData(driver, inputName, "John Doe", 0);

        click(driver, inputCountry, 5 );
        formData(driver, inputCountry, "Portugal", 0);

        click(driver, inputCity, 5 );
        formData(driver, inputCity, "Lisbon", 0);

        click(driver, inputCard, 5 );
        formData(driver, inputCard, "375567668884617", 0);

        click(driver, inputMonth, 5 );
        formData(driver, inputMonth, "02", 0);

        click(driver, inputYear, 5 );
        formData(driver, inputYear, "2030", 0);

        click(driver,clickPurchase, 0 );

        click(driver, valueID, 1);
        System.out.println("Result: " + valueID);

        click(driver, validationName, 1);
        System.out.println("Result: " + validationName);

        click(driver, valuePaid, 1);
        System.out.println("Result: " + valuePaid);


    }
}
