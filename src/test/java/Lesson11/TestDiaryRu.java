package Lesson11;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class TestDiaryRu {
    private WebDriver driver;
    private WebDriverWait wait;
    private final String URL = "https://diary.ru/user/registration";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void registrationUserPositive() {
        driver.get(URL);
        WebElement name = wait.until(elementToBeClickable(By.xpath("//input[@id='signupform-username']")));
        name.sendKeys("kovalevskyi" + GetRandomDigitUtil.getRandomInt());
        WebElement email = wait.until(elementToBeClickable(By.xpath("//input[@id='signupform-email']")));
        email.sendKeys("kovalevskyi" + GetRandomDigitUtil.getRandomInt() + "@gmail.com");
        WebElement box = wait.until(elementToBeClickable(By.xpath("//input[@id='chk_box_user_confirm']")));
        box.click();
        WebElement button = wait.until(elementToBeClickable(By.xpath("//button[@class='btn btn-primary btn-lg']")));
        button.click();
        WebElement waitTitle = wait.until(elementToBeClickable(By.xpath("//button[@class='btn btn-primary btn-lg']")));
        boolean title1 = waitTitle.isDisplayed();
        Assertions.assertTrue(title1, "User was not registered");
    }

    @Test
    public void registrationUserUsingRussianAndLatinLettersNegative() {
        driver.get(URL);
        WebElement inputName = driver.findElement(By.xpath("//input[@id='signupform-username']"));
        inputName.sendKeys("qwerйцуке");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='signupform-email']"));
        inputEmail.sendKeys("kovalevskyi" + GetRandomDigitUtil.getRandomInt() + "@gmail.com");
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='chk_box_user_confirm']"));
        checkBox.click();
        WebElement submitButton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']"));
        submitButton.click();
        boolean validationLabel = driver.findElement
                (By.xpath("//div[@class='form-group field-signupform-username required has-error']/p")).isDisplayed();
        Assertions.assertTrue(validationLabel, "Validation is broken");
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("Test closed");
    }
}
