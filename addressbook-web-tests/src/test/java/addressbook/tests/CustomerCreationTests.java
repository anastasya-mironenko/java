package addressbook.tests;

import addressbook.model.CustomerData;
import org.testng.annotations.Test;

public class CustomerCreationTests extends TestBase{

    @Test
    public void testCustomerCreation() {

        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new CustomerData("Testik1", "Testik2", "Testik3", "mobile1", "email1@mail.ru", "Test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().returnHomePage();
    }

}
