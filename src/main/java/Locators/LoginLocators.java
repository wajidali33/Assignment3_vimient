package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLocators {
    private  WebDriver driver;
    private String EMAIL_ID="email";

    private String PASSWORD_ID="password";
    private String LOGIN_BUTTON_XPATH="//button[@type='submit']";
    private String CLICKSENIOR_XPATH="//*[@id='root']/div[3]/div/div[2]/div[2]/div/div/table/tbody/tr[5]";

    private String LOGINMESSAGE_CSSLOCATOR=".MuiAlert-message";
    private String CLOSEPOPUP_XPATH="//*[@id='root']/div[3]/div/div[3]/button/svg"

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
    public WebElement getClosePopup(){
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[3]/button/svg"));
    }


}
