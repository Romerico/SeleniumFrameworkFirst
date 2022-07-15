package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RadioPage;

public class RadioTest extends BaseTest{

    RadioPage radioPage;

    @BeforeMethod
    public void goToTargetPage() {
        setUp();
        radioPage = new RadioPage(driver);
        radioPage.goToRadioButtonPage();
    }

    @AfterMethod
    public void closingActivity() {
        tearDown();
    }

    @Test
    public void ageTest() {
        radioPage.selectYourAgeGroup(75);
        int actualAgeValue = radioPage.getTheSelectedAgeValue();
        Assert.assertEquals(actualAgeValue, 2);
    }
}
