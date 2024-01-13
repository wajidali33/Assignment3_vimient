package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLocators {
    private  WebDriver driver;
    private String EMAIL_ID="email";

    private String PASSWORD_ID="password";
    private String LOGIN_BUTTON_XPATH="//button[@type='submit']";

    public LoginLocators(WebDriver driver){
        this.driver= driver;
    }
    public WebElement getEmail(){
        return driver.findElement(By.id(EMAIL_ID));
    }
    public WebElement getPassword(){
        return driver.findElement(By.id(PASSWORD_ID));
    }
    public WebElement getLoginButton(){
        return driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
    }

}
