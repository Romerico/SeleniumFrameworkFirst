package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roman Yarmolenko\\IdeaProjects\\Framework\\src\\main\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.leafground.com");
    }
    public void tearDown(){
        driver.quit();

    }
}
