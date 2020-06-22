package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import sun.lwawt.macosx.CPrinterDevice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Annotations {
    public Annotations(WebDriver driver) {
        //this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Find and click Web Element Radio Button
    @FindBy(how = How.XPATH, using = "//*[@id='radio-btn-example']/fieldset/label[2]/input")
    WebElement webElementRadioButton;

    public boolean clickWebElementRadioButton(){
        webElementRadioButton.click();
        Boolean booleanRadioButton = webElementRadioButton.isSelected();
        return booleanRadioButton;
    }

    //Find and click Web Element Dropdown
    @FindBy(how = How.XPATH,using = "//*[@id='dropdown-class-example']")
    WebElement webElementDropdown;

    public void clickWebElementDropDown(){
        webElementDropdown.click();
    }

    public void saveDropdownToList(){
        List<WebElement> temp = webElementDropdown.findElements(By.className("ui-menu-item-wrapper"));
        System.out.println(temp.get(0));
    }

    //Find and click Web Element Checkbox
    @FindBy(how = How.XPATH, using = "//*[@id='checkBoxOption2']")
    WebElement webElementCheckBox;

    public boolean clickWebElementCheckBox(){
        if (!webElementCheckBox.isSelected()){
            webElementCheckBox.click();
        }
        Boolean booleanCheckbox = webElementCheckBox.isSelected();
        System.out.println(booleanCheckbox);
        return booleanCheckbox;
    }

    //Find and click open window button
    @FindBy(how = How.XPATH, using = "//*[@id='openwindow']")
    WebElement webElementOpenWindowButton;

    public void clickWebElementOpenWindowButton(){
        webElementOpenWindowButton.click();
    }

    //Find Countries Searchbar, Search and select canada
    @FindBy(how = How.XPATH, using = "//*[@id='autocomplete']")
    WebElement webElementCountriesSearchBar;

    @FindBy(how = How.LINK_TEXT, using = "Canada")
    WebElement webElementCountriesSearchBarItem;

    public void clickWebElementCountriesSearchBar(){
        webElementCountriesSearchBar.click();
    }

    public void searchWebElementCountriesSearchBarItem(String hint){
        boolean temp;
        webElementCountriesSearchBar.sendKeys(hint);
    }

    public void clickWebElementCountriesSearchBarItem() {
        webElementCountriesSearchBarItem.click();
    }

    //Find and click open tab button
    @FindBy(how = How.XPATH, using = "//*[@id='opentab']")
    WebElement webElementOpenTabButton;

    public void clickWebElementOpenTabButton(){
        webElementOpenTabButton.click();
    }

    //Find and Click "Enter your name" textfield
    @FindBy(how = How.XPATH,using = "//*[@id='name']")
    WebElement webElementEnterNameTextField;

    @FindBy(how = How.XPATH,using = "//*[@id='alertbtn']")
    WebElement webElementEnterNameTextFieldAlertButton;

    @FindBy(how = How.XPATH,using = "//*[@id='confirmbtn']")
    WebElement getWebElementEnterNameTextFieldConfirmButton;

    public void clickWebElementEnterNameTextField(){
        webElementEnterNameTextField.click();
    }

    public void sendKeysWebElementEnterNameTextField(String keys){
        webElementEnterNameTextField.sendKeys(keys);
    }

    public void clickWebElementEnterNameTextFieldAlertButton(){
        webElementEnterNameTextFieldAlertButton.click();
    }

    public void clickWebElementEnterNameTextFieldConfirmButton(){
        getWebElementEnterNameTextFieldConfirmButton.click();
    }
}
