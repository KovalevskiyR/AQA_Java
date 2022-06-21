package Lesson15;

import Lesson11.GetRandomDigitUtil;
import Lesson15Pages.DiaryRuPage;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DiaryRuTest {
    private WebDriver driver;
    private DiaryRuPage registrationPage;
    private final String URL = "https://diary.ru/user/registration";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.registrationPage = new DiaryRuPage(driver);
    }

    @Test
    public void registrationUserPositive() {
        driver.get(URL);
        registrationPage.inputNameAndEmail("kovalevskyi" + GetRandomDigitUtil.getRandomInt(),
                "kovalevskyi" + GetRandomDigitUtil.getRandomInt() + "@gmail.com");
        registrationPage.markCheckbox();
        registrationPage.clickSubmitButton();
        Assertions.assertTrue(registrationPage.titlePresent());
    }

    @Test
    public void registrationUserUsingRussianAndLatinLettersNegative() {
        driver.get(URL);
        registrationPage.inputNameAndEmail("qwerйцуке",
                "kovalevskyi" + GetRandomDigitUtil.getRandomInt() + "@gmail.com");
        registrationPage.markCheckbox();
        registrationPage.clickSubmitButton();
        Assertions.assertTrue(registrationPage.validationLabelPresent());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
