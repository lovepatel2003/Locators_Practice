package Browser;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OpenBrowser {
    WebDriver driver;
    String browser="chrome";

    @Before
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

    @After
    public void tearDown(){
        System.out.println("sbjdfkdsfjkdsfjds");
        driver.quit();

    }
}
