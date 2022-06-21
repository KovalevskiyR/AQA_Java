package Lesson15;

import Lesson15Pages.BbcPage;
import config.PropertiesConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BbcTest {
    private WebDriver driver;
    private BbcPage loginPage;
    private final String URL = "https://www.bbc.com/";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        this.loginPage = new BbcPage(driver);
    }

    @Test
    public void signInBbcPositive(){
        driver.get(URL);
        loginPage.clickSignInButton();
        loginPage.enterUserNameAndPassword(PropertiesConfig.getProperty("login"), "Qwerty1!");
        loginPage.clickSubmitButton();
        Assert.assertTrue(loginPage.accountButtonPresent());
    }

    @Test
    public void signInBbcNegative(){
        driver.get(URL);
        loginPage.clickSignInButton();
        loginPage.enterUserNameAndPassword("qweqwer", "qwerqwer");
        loginPage.clickSubmitButton();
        Assert.assertTrue(loginPage.validationMessagePresent());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
