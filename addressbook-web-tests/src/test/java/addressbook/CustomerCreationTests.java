package addressbook;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CustomerCreationTests extends TestBase{

    @Test
    public void testCustomerCreation() {

        initContactCreation();
        fillContactForm(new CustomerData("Testik1", "Testik2", "Testik3", "mobile1", "email1@mail.ru"));
        submitContactCreation();
        returnHomePage();
    }

}
