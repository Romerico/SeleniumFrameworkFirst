package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class ButtonPage extends BasePage{

    public ButtonPage(WebDriver driver) {
super(driver);
    }

    public void goToButtonPage(){
        driver.get("http://www.leafground.com/pages/Button.html");
    }


    public String getPageTitle(){
        return driver.getTitle();
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    By homeButtonLocator = By.id("home");
    By locationButtonLocator = By.cssSelector("#position");
    By colorButtonLocator = By.cssSelector("#color");
    By dimensionButtonLocator = By.cssSelector("#size");

    public void clickHomeButton(){
        driver.findElement(homeButtonLocator).click();
    }

    public String getLocationOfLocationButton(){
        Point location = driver.findElement(locationButtonLocator).getLocation();
        return "X: " + location.getX() + "\t" + location.getY();
    }

    public String getColorButtonLocator(){
        return driver.findElement(colorButtonLocator).getCssValue("background-color");
    }

    public String getDimensionOfDimensionButton(){
        Dimension dimension = driver.findElement(dimensionButtonLocator).getSize();
        return "Height :" + dimension.getHeight() + "\t Width : " + dimension.getWidth();
    }

    }
