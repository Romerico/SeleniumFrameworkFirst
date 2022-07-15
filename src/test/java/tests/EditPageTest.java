package tests;

import org.testng.annotations.Test;
import pages.EditPage;
import pages.HomePage;

public class EditPageTest extends  BaseTest{



    @Test
    public void inputFieldTest(){

        setUp();

        HomePage homePage = new HomePage(driver);
        homePage.goToEditPage();
        EditPage editPage = new EditPage(driver);
        editPage.editPageActions();

        tearDown();
    }

}
