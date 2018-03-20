package addressbook.tests;

import org.testng.annotations.Test;

public class CustomerDeletionTests extends  TestBase{

    @Test
    public void testCustomerDeletion(){

        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().gotoHomePage();
    }
}
