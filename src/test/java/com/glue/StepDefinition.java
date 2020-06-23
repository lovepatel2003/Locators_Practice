package com.glue;

import Browser.OpenBrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.SetIterator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageFactory.Annotations;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class StepDefinition{
    OpenBrowser objOpenBrowser = new OpenBrowser();
    WebDriver driver = objOpenBrowser.browserOpen();
    Boolean booleanRadioButton;
    Boolean booleanCheckBox;
    Annotations objAnnotations;
    ArrayList<String> temp;

    //Radio Button
    @Given("Open Rahul Shetty Website")
    public void open_Rahul_Shetty_Website() {
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
    }

    @When("Click on Radio button")
    public void click_on_Radio_button() {
        objAnnotations = new Annotations(driver);
        booleanRadioButton = objAnnotations.clickWebElementRadioButton();
    }

    @Then("Validate that the radio button is selected")
    public void validate_that_the_radio_button_is_selected() {
        Assert.assertTrue(booleanRadioButton);
    }

    //Find Countries Searchbar, Search and select canada
    @When("Click on select countries searchbar")
    public void clickOnSelectCountriesSearchbar() {
        objAnnotations = new Annotations(driver);
        objAnnotations.clickWebElementCountriesSearchBar();
    }

    @Then("Search Cana")
    public void searchCana() {
        String keys = "Cana";
        objAnnotations = new Annotations(driver);
        objAnnotations.searchWebElementCountriesSearchBarItem(keys);
    }

    @Then("Click Canada")
    public void clickCanada() throws InterruptedException {
        Thread.sleep(4000);
        objAnnotations = new Annotations(driver);
        objAnnotations.clickWebElementCountriesSearchBarItem();
    }

    //Dropdown Menu
    @When("Click on dropdown menu")
    public void click_on_dropdown_menu() {
        //driver.findElement(By.xpath("//*[@id='dropdown-class-example']")).click();
        objAnnotations = new Annotations(driver);
        objAnnotations.clickWebElementDropDown();
    }

    @Then("save the dropdown menu options in a list")
    public void save_the_dropdown_menu_options_in_a_list() throws InterruptedException {
        Thread.sleep(5000);
        objAnnotations = new Annotations(driver);
        objAnnotations.saveDropdownToList();
    }

    @Then("click on second element")
    public void click_on_second_element() {
        //driver.close();
    }

    //CheckBox
    @When("Click on Checkbox")
    public void clickOnCheckbox() {
        objAnnotations = new Annotations(driver);
        booleanCheckBox = objAnnotations.clickWebElementCheckBox();
    }

    @Then("Validate that the Checkbox is checked")
    public void validateThatTheCheckboxIsChecked() {
        Assert.assertTrue(booleanCheckBox);
        //driver.close();
    }

    //Open new window
    @When("Click on Open Window button")
    public void clickOnOpenWindowButton() {
        objAnnotations = new Annotations(driver);
        objAnnotations.clickWebElementOpenWindowButton();
    }

    @Then("validate the new window is opened")
    public void validateTheNewWindowIsOpened() {
        Set<String> windowIds = driver.getWindowHandles();
        int i = 1;
        System.out.println(windowIds);

        SetIterator obj = new SetIterator();
        temp = obj.iterator(windowIds, i);
        System.out.println(temp);

        String switchWindowId = "";
        for (int j=0;j<=i;j++){
            switchWindowId = temp.get(j);
        }
        System.out.println(switchWindowId);

        driver.switchTo().window(switchWindowId);

        driver.manage().window().maximize();

        //driver.close();
    }

    @When("Click on Open tab")
    public void clickOnOpenTab() {
        objAnnotations = new Annotations(driver);
        objAnnotations.clickWebElementOpenTabButton();
    }

    @Then("validate the new tab is opened")
    public void validateTheNewTabIsOpened() {
        Set<String> windowIds = driver.getWindowHandles();
        int i = 1;
        System.out.println(windowIds);

        SetIterator obj = new SetIterator();
        temp = obj.iterator(windowIds, i);
        System.out.println(temp);

        String switchWindowId = "";
        for (int j=0;j<=i;j++){
            switchWindowId = temp.get(j);
        }
        System.out.println(switchWindowId);

        driver.switchTo().window(switchWindowId);
        //driver.manage().window().maximize();
    }

    //Find and Click "Enter your name" textfield
    @When("Click on Enter your name textfield")
    public void clickOnEnterYourNameTextfield() {
        objAnnotations = new Annotations(driver);
        objAnnotations.clickWebElementEnterNameTextField();
    }

    @Then("Enter Love Patel")
    public void enterLovePatel() {
        String keys = "Love Patel";
        objAnnotations = new Annotations(driver);
        objAnnotations.sendKeysWebElementEnterNameTextField(keys);
    }

    @And("Click on Alert")
    public void clickOnAlert() {
        objAnnotations = new Annotations(driver);
        objAnnotations.clickWebElementEnterNameTextFieldAlertButton();
    }

    @And("Click on Ok")
    public void clickOnOk() {
        driver.switchTo().alert().accept();
    }

    @And("Click on Confirm")
    public void clickOnConfirm() {
        objAnnotations = new Annotations(driver);
        objAnnotations.clickWebElementEnterNameTextFieldConfirmButton();
    }

    @And("Click on Cancel")
    public void clickOnCancel() {
        driver.switchTo().alert().dismiss();
    }
}
