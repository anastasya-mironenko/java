package addressbook.appmanager;

import addressbook.model.CustomerData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Анастасия on 19.03.2018.
 */
public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super(wd);;
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(CustomerData customerData) {
        type(By.name("firstname"),customerData.getFirstname());
        type(By.name("lastname"),customerData.getLastname());
        type(By.name("address"),customerData.getAddress());
        type(By.name("mobile"),customerData.getMobile());
        type(By.name("email"),customerData.getEmail());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }
}
