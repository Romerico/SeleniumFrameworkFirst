package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    String SeleniumInteractionsPageXPath = "//h5[text()='$$']/parent::a";

    public void goToEditPage(){
        driver.findElement(By.xpath(SeleniumInteractionsPageXPath.replace("$$", "Edit"))).click();

    }



}
