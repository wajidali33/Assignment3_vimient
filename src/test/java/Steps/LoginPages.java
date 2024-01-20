package Steps;

import Locators.LoginLocators;
import com.google.j2objc.annotations.Weak;
import core.WebDriverHook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    public void enterEmail(String email){
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

    @Then("user will successfully login {string}")
    public void user_will_successfully_login(String string) throws InterruptedException {
        Wait<WebDriver> wait = new WebDriverWait(webDriverHook.getDriver(), Duration.ofSeconds(5));
        wait.until(d -> loginLocators.getLoginMEssage().isDisplayed());
        Assert.assertEquals(string, loginLocators.getLoginMEssage().getText());
    }
    @And("use will click to select the senior")
    public void user_will_click_to_senior(){
        Wait<WebDriver> wait = new WebDriverWait(webDriverHook.getDriver(), Duration.ofSeconds(10));
        wait.until(d -> loginLocators.getSeniorClick().isDisplayed());
        loginLocators.getSeniorClick().click();}



}
