package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LinksPage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class LinksTest extends BaseTest {


    LinksPage linksPage = new LinksPage(driver);

    @BeforeMethod
    public void goToTargetPage() {
        setUp();
        linksPage.goToLinksPage();
        linksPage.goToHomePageLink();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void homePageLinkTest() {

        System.out.println(linksPage.getPageTitle());
        Assert.assertEquals(linksPage.getPageTitle(), "TestLeaf - Selenium Playground");

        tearDown();
    }

    @Test
    public void destinationTest() {
        String dest = linksPage.getDestinationWithoutClickingMeLink();
        Assert.assertTrue(dest.contains("Button.html"));

    }

    @Test
    public void goToHomePageLink2Test() {
        linksPage.homePageLink2();
    }

    @Test
    public void linksCount() {
        int actualLinksCount = linksPage.getTotalLinkCount();
        Assert.assertEquals(actualLinksCount, 6);
    }


    @Test
    public void brokenLinkTest() {
        String urlInStringFormat = linksPage.gethrefValueOfBrokenLink();
        URL urlInURLFormat = null;
        try {
            urlInURLFormat = new URL(urlInStringFormat);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = (HttpURLConnection) (urlInURLFormat.openConnection());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        try {
            httpURLConnection.setRequestMethod("HEAD");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
        try {
            httpURLConnection.connect();
            Assert.assertTrue(httpURLConnection.getResponseCode() >= 400);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


    }
}
