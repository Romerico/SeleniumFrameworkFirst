package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksPage extends BasePage{

//locators
    By withoutClickingMeLink = By.partialLinkText("clicking me?");
    By homePageLink = By.linkText("Go to Home Page");
    By brokenLink = By.linkText("Verify am I broken?");
    By homePageLink2 = By.xpath("(//a[.='Go to Home Page'])[2]");
//constructor
    public LinksPage(WebDriver driver) {
        super(driver);
    }
//methods

    public void goToLinksPage(){
        driver.get("http://www.leafground.com/pages/Link.html");

    }

    public String getPageTitle(){return driver.getTitle();}

    public void goToHomePageLink() {
        driver.findElement(homePageLink).click();
    }

    public String getDestinationWithoutClickingMeLink() {
      return driver.findElement(withoutClickingMeLink).getAttribute("href");
    }

    public void homePageLink2() {
        driver.findElement(homePageLink2).click();

    }

    public String gethrefValueOfBrokenLink() {
        return driver.findElement(brokenLink).getAttribute("href");
    }

    public int getTotalLinkCount() {
       return driver.findElements(By.xpath("//a")).size();
    }



}
