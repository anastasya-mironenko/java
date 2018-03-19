package addressbook.tests;

import addressbook.model.CustomerData;
import org.testng.annotations.Test;

public class CustomerCreationTests extends TestBase{

    @Test
    public void testCustomerCreation() {

        app.initContactCreation();
        app.fillContactForm(new CustomerData("Testik1", "Testik2", "Testik3", "mobile1", "email1@mail.ru"));
        app.submitContactCreation();
        app.returnHomePage();
    }

}