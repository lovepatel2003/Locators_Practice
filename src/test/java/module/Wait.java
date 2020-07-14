package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
    public static void execute(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 80);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void executeInvisibility(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 80);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
