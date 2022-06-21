package Lesson14;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestAndersen {
    private WebDriver driver;
    private JavascriptExecutor js;
    private final String URL = "https://andersenlab.com/";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void checkFacebookIconIsPresent() {
        driver.get(URL);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        WebElement facebookIcon = driver.findElement
                (By.cssSelector("a:nth-of-type(1) > .SocialMediaIcon-module--icon--xnGyY"));
        boolean isButtonPresent = facebookIcon.isDisplayed();
        Assert.assertTrue("Button doesn't display", isButtonPresent);
    }

    @Test
    public void checkIsBannerDisplayed() {
        driver.get(URL);
        WebElement standWithUkraineBanner = driver.findElement
                (By.cssSelector("a >div.Banner-module--contentWrapper--S5Pd6"));
        boolean isBannerPresent = standWithUkraineBanner.isDisplayed();
        Assert.assertTrue("Button doesn't display", isBannerPresent);
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("Test closed");
    }
}
