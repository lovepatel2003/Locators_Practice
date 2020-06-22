package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    WebDriver driver;
    String browser="chrome";

    public WebDriver browserOpen(){

        if (browser.toLowerCase().equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            driver = new ChromeDriver();
        }
        else if(browser.toLowerCase().equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
            driver = new FirefoxDriver();
        }

        return driver;
    }
}
