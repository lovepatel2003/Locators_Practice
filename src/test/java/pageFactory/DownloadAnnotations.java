package pageFactory;

import module.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DownloadAnnotations {
    private final RemoteWebDriver driver;
    public DownloadAnnotations( RemoteWebDriver driver) {
        this.driver = driver;
        //this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH,using = "/html/body/div[2]/div[2]/p/a[1]")
    WebElement webElementDownloadIDWindows;

    public Boolean clickWebElementDownloadIDWindows(){
        Boolean bool = false;
        if (webElementDownloadIDWindows.isDisplayed()){
            webElementDownloadIDWindows.click();
            bool = true;
        }
        return bool;
    }

    @FindBy(how = How.XPATH,using = "//*[@id='identifierId']")
    WebElement webElementGmailSignIn;

    public void sendKeysWebElementGmailSignIn(String emailKeys){
        Wait.execute(driver, webElementGmailSignIn);
        webElementGmailSignIn.sendKeys(emailKeys);
    }

    @FindBy(how = How.XPATH,using = "//*[@id='identifierNext']/div/span")
    WebElement webElementGmailSignInNextButton;

    public void clickWebElementGmailSignInNextButton(){
        Wait.execute(driver, webElementGmailSignInNextButton);
        webElementGmailSignInNextButton.click();
    }

    @FindBy(how = How.XPATH,using = "//*[@id='password']/div[1]/div/div[1]/input")
    WebElement webElementGmailPassword;

    public void sendKeyswebElementGmailPassword(String passwordKeys) {
        //Thread.sleep(5000);

        Wait.execute(driver, webElementGmailPassword);
        webElementGmailPassword.sendKeys(passwordKeys);
    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    WebElement webElementGmailPasswordNextButton;

    public void clickWebElementGmailPasswordNextButton(){
        webElementGmailPasswordNextButton.click();
    }
}
