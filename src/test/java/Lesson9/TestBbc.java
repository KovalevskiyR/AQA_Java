package Lesson9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBbc {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void signInBbcPositive() {
        driver.get("https://www.bbc.com/");
        driver.findElement(By.id("idcta-username")).click();
        driver.findElement(By.cssSelector("input#user-identifier-input")).sendKeys("kovalevskiy.00220@gmail.com");
        driver.findElement(By.cssSelector("input#password-input")).sendKeys("Qwerty1!");
        driver.findElement(By.id("submit-button")).click();
    }

    @Test
    public void signInBbcNegative() {
        driver.get("https://www.bbc.com/");
        driver.findElement(By.id("idcta-username")).click();
        driver.findElement(By.cssSelector("input#user-identifier-input")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("input#password-input")).sendKeys("qwerty");
        driver.findElement(By.id("submit-button")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("Test closed");
    }
}
