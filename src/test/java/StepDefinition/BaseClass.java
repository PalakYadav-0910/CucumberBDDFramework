package StepDefinition;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import PageObject.SearchCustomerPage;
import Utilities.ReadConfig;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.*;

public class BaseClass
{
    public static  WebDriver driver;
    public LoginPage loginPg;
    public SearchCustomerPage SearchCustPg;
    public AddNewCustomerPage addNewCustPg;
    public static Logger log;
    public ReadConfig readConfig;
    //generate unique email id
    public String generateEmailId()
    {
        return(RandomStringUtils.randomAlphabetic(5));
    }
}
