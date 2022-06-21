package Lesson15;

import Lesson15Pages.AndersenPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AndersenTest {
    private WebDriver driver;
    private AndersenPage andersenPage;
    private final String URL = "https://andersenlab.com/";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.andersenPage = new AndersenPage(driver);
    }

    @Test
    public void checkFaceBookIconPresent(){
        driver.get(URL);
        Assert.assertTrue(andersenPage.faceBookIconPresent());
    }

    @Test
    public void checkStandWithUkraineBannerPresent(){
        driver.get(URL);
        Assert.assertTrue(andersenPage.standWithUkraineBannerPresent());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
