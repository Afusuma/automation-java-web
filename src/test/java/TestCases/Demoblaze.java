package TestCases;

import Page.AMEXCartPage;
import Page.VisaCardCartPage;
import Page.WithoutCreditCardCartPage;
import Utilities.Drivers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Demoblaze {

    public WebDriver driver;
    Drivers driverManager;
    AMEXCartPage amexCartPage;
    VisaCardCartPage visaCardCartPage;
    WithoutCreditCardCartPage withoutCreditCardCartPage;

    @Before
    public void setup(){
        driverManager = new Drivers();
        driver = Drivers.browser("chrome");
        amexCartPage = new AMEXCartPage(driver);
        visaCardCartPage = new VisaCardCartPage(driver);
        withoutCreditCardCartPage = new WithoutCreditCardCartPage(driver);
    }
    @Test
    public void amex() throws InterruptedException {
        driver.get("https://demoblaze.com/");
        amexCartPage.addMacBookPro();
        amexCartPage.forms();
    }

    public void visaCard() throws InterruptedException {
        driver.get("https://demoblaze.com/");
        amexCartPage.addMacBookPro();
        visaCardCartPage.forms();
    }

    public void withoutCreditCard() throws InterruptedException {
        driver.get("https://demoblaze.com/");
        amexCartPage.addMacBookPro();
        withoutCreditCardCartPage.forms();
    }
    @After
    public void end(){
        driver.quit();
    }
}
