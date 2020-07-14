package com.glue;

import Browser.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.Constant;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageFactory.DownloadAnnotations;

public class DownloadStepDefinition {
    OpenBrowser objOpenBrowser = new OpenBrowser();
    RemoteWebDriver driver = objOpenBrowser.browserOpen();
    DownloadAnnotations objDownloadAnnotations;
    Boolean validateDownloadIDWindows;

    @Given("go to selenium website")
    public void go_to_selenium_website() {
        driver.manage().window().maximize();
        driver.get(Constant.inputURL);
    }

    @When("Click on Windows ID Download")
    public void click_on_Windows_ID_Download() {
        objDownloadAnnotations = new DownloadAnnotations(driver);
        validateDownloadIDWindows = objDownloadAnnotations.clickWebElementDownloadIDWindows();
    }

    @Then("Validate if Windows ID Download is clicked")
    public void validate_if_Windows_ID_Download_is_clicked() {
        Assert.assertTrue(validateDownloadIDWindows);
    }

    //Test in GMAIL
    @Given("go to gmail login webpage")
    public void goToGmailLoginWebpage() {
        driver.manage().window().maximize();
        driver.get(Constant.gmailSignInInputURL);
    }

    @Then("validate the confirmation message")
    public void validateTheConfirmationMessage() {
    }

    @When("^enter (.*?) and \"([^\"]*)\" to sign in$")
    public void enterEmailAndPasswordToSignIn(String emailKeys, String passwordKeys) throws InterruptedException {
        objDownloadAnnotations = new DownloadAnnotations(driver);

        objDownloadAnnotations.sendKeysWebElementGmailSignIn(emailKeys);
        objDownloadAnnotations.clickWebElementGmailSignInNextButton();

        objDownloadAnnotations.sendKeyswebElementGmailPassword(passwordKeys);
        objDownloadAnnotations.clickWebElementGmailPasswordNextButton();
    }

}
