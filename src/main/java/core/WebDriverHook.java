//package core;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.Properties;
//
//public class WebDriverHook {
//
//    private WebDriver driver;
//    public static Properties myProp = ConfigUtil.getConfig("config");
//
//    public  void initializeDriver() {
//        if (driver == null) {
//            driver = new ChromeDriver();
//            driver.get(myProp.getProperty("base_url")+myProp.getProperty("practice_form_url"));
//            driver.manage().window().maximize();
//        }
//    }
//
//    public  WebDriver getDriver() {
//        return driver;
//    }
//
//
//
////    public  void closeDriver() {
////            driver.quit();
////    }
//
//
//    public void beforeScenario() {
//        initializeDriver();
//    }
//
////    @After
////    public void afterScenario() {
////        closeDriver();
////    }
//
//}


package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class WebDriverHook {

    private static WebDriver driver;
    private static Properties myProp = ConfigUtil.getConfig("config");
    private static WebDriverHook instance;

    public WebDriverHook() {
        // Initialize the WebDriver here instead of a separate initializeDriver() method
        driver = new ChromeDriver();
        driver.get(myProp.getProperty("base_url_qa") );
        driver.manage().window().maximize();
    }

    public static WebDriverHook getInstance() {
        if (instance == null) {
            instance = new WebDriverHook(); // This will initialize the driver the first time it is called
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            instance = null;
        }
    }
}


