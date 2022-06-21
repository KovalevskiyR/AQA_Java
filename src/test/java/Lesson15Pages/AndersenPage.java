package Lesson15Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AndersenPage {
    private JavascriptExecutor js;

    @FindBy(css = "a:nth-of-type(1) > .SocialMediaIcon-module--icon--xnGyY")
    WebElement faceBookIcon;

    @FindBy(css = "a >div.Banner-module--contentWrapper--S5Pd6")
    WebElement standWithUkraineBanner;

    public AndersenPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public boolean faceBookIconPresent() {
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        return faceBookIcon.isDisplayed();
    }

    public boolean standWithUkraineBannerPresent() {
        return standWithUkraineBanner.isDisplayed();
    }
}
