package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginLocators {
    private  WebDriver driver;
    private String EMAIL_ID="email";

    private String PASSWORD_ID="password";
    private String LOGIN_BUTTON_XPATH="//button[@type='submit']";
    private String CLICKSENIOR_XPATH="//table[@aria-label='a dense table']//td[contains(text(),'Mujtaba0129')]";
    //table[@id='tblData']//td')]
    private String LOGINMESSAGE_CSSLOCATOR=".MuiAlert-message";

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
    public WebElement getSeniorClick(){
        return driver.findElement(By.xpath(CLICKSENIOR_XPATH));
    }
    public WebElement getLoginMEssage(){
        return driver.findElement(By.cssSelector(LOGINMESSAGE_CSSLOCATOR));
    }


}
