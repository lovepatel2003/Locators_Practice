package com.glue;

import Browser.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageFactory.Annotations;

public class StepDefinition{
    OpenBrowser objOpenBrowser = new OpenBrowser();
    WebDriver driver = objOpenBrowser.browserOpen();
    Boolean temp;
    Annotations objAnnotations;
    @Given("Open Rahul Shetty Website")
    public void open_Rahul_Shetty_Website() {
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
    }

    @When("Click on Radio button")
    public void click_on_Radio_button() {
        driver.findElement(By.xpath("//*[@id='radio-btn-example']/fieldset/label[2]/input")).click();
        temp = driver.findElement(By.xpath("//*[@id='radio-btn-example']/fieldset/label[2]/input")).isSelected();
        System.out.println(temp);
    }

    @Then("Validate that the radio button is selected")
    public void validate_that_the_radio_button_is_selected() {
        Assert.assertTrue(temp);
        driver.close();
    }

    @When("Click on dropdown menu")
    public void click_on_dropdown_menu() {
        //driver.findElement(By.xpath("//*[@id='dropdown-class-example']")).click();
        objAnnotations = new Annotations(driver);
        objAnnotations.TestDropDown();
    }

    @Then("save the dropdown menu options in a list")
    public void save_the_dropdown_menu_options_in_a_list() {

    }

    @Then("click on second element")
    public void click_on_second_element() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
