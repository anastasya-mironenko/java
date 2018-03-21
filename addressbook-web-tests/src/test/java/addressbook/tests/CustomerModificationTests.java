package addressbook.tests;

import addressbook.model.CustomerData;
import org.testng.annotations.Test;

public class CustomerModificationTests extends TestBase{

    @Test
    public void testCustomerModification(){

        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new CustomerData("Testik1", "Testik2", "Testik3", "mobile1", "email1@mail.ru"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new CustomerData("Testik11", "Testik2", "Testik3", "mobile1", "email1@mail.ru"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnHomePage();
    }
}
