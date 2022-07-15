package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ButtonPage;

public class ButtonTest extends BaseTest{

    ButtonPage buttonPage = new ButtonPage(driver);

    @BeforeMethod
    public void goToTargetPage(){
        setUp();
        buttonPage.goToButtonPage();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



    @Test
    public void setPageTitleTest(){

        goToTargetPage();
        String PageTitle = buttonPage.getPageTitle();
        System.out.println(PageTitle);
//        driver.findElement(By.id("home")).click();
        buttonPage.clickHomeButton();
        System.out.println(driver.getTitle());
        buttonPage.navigateBack();

        String PageTitle2 = buttonPage.getPageTitle();
        System.out.println(PageTitle2);

        if (PageTitle.equals(PageTitle2)) {
            System.out.println("passed");
        } else {
            System.out.println("wrong path");
        }

    }
    @Test
    public void positionOfTheButtonTest(){
        goToTargetPage();


//        WebElement positionButtonElement = driver.findElement(By.cssSelector("#position"));
//        Point buttonPoint = positionButtonElement.getLocation();
//        System.out.println("x : " + buttonPoint.getX());
//        System.out.println("y : " + buttonPoint.getY());.
        System.out.println(buttonPage.getLocationOfLocationButton());


    }
    @Test
    public void buttonColorTest(){
        goToTargetPage();


//        WebElement colorButtonElement = driver.findElement(By.cssSelector("#color"));
//        System.out.println(colorButtonElement.getCssValue("background-color"));
        System.out.println(buttonPage.getColorButtonLocator());

    }
    @Test
    public void dimensionsTest(){
        goToTargetPage();

//        WebElement dimensionElement = driver.findElement(By.cssSelector("#size"));
//        Dimension dimension = dimensionElement.getSize();
//        System.out.println("Height: " + dimension.getHeight());
//        System.out.println("Width: " + dimension.getWidth());
        System.out.println(buttonPage.getDimensionOfDimensionButton());


    }


}
