package Steps;

import Locators.LoginLocators;
import com.google.j2objc.annotations.Weak;
import core.WebDriverHook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPages {
    private LoginLocators loginLocators;
    private WebDriverHook webDriverHook;

    public LoginPages(){
        webDriverHook = WebDriverHook.getInstance();
        loginLocators = new LoginLocators(webDriverHook.getDriver());

    }
    @Given("user is on the login page")
    public void goToWebApp(){
        loginLocators = new LoginLocators(webDriverHook.getDriver());
    }

    @When("user insert correct email {string}")
    public void eneterEmail(String email){
        loginLocators.getEmail().sendKeys(email);
    }
    @And("user insert correct password {string}")
    public void enterPassword(String password){
        loginLocators.getPassword().sendKeys(password);
    }
    @And("user click login page")
    public  void clickLoginButton(){
        loginLocators.getLoginButton().click();
    }
}
