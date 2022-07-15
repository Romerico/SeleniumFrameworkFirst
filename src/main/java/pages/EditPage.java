package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EditPage extends BasePage {

    public EditPage(WebDriver driver){
        super(driver);
    }
    static String input_SeleniumInteractionsPageXPath = "//label[contains(text(),'$$')]//following-sibling::input";



    public void editPageActions() {



        driver.findElement(By.xpath(input_SeleniumInteractionsPageXPath.replace("$$", "email"))).sendKeys("werwer@gmail.com");

        driver.findElement(By.xpath(input_SeleniumInteractionsPageXPath.replace("$$", "Append"))).sendKeys("Text appended");

        driver.findElement(By.xpath(input_SeleniumInteractionsPageXPath.replace("$$", "Append"))).sendKeys(Keys.TAB);
        System.out.println(driver.findElement(By.xpath(input_SeleniumInteractionsPageXPath.replace("$$", "default"))).getAttribute("value"));

        driver.findElement(By.xpath(input_SeleniumInteractionsPageXPath.replace("$$", "Clear"))).clear();
        System.out.println("The edit row is enabled = " + driver.findElement(By.xpath(input_SeleniumInteractionsPageXPath.replace("$$", "edit"))).isEnabled());


    }
}
