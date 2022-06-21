package Lesson15Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BbcPage {
    @FindBy(id = "idcta-username")
    private WebElement signInButton;

    @FindBy(css = "input#user-identifier-input")
    private WebElement userName;

    @FindBy(css = "input#password-input")
    private WebElement userPassword;

    @FindBy(id = "submit-button")
    private WebElement submitButton;

    @FindBy(id = "idcta-link")
    private WebElement accountNavButton;

    @FindBy(xpath = "//span[text ()='Пожалуйста, включите что-нибудь, кроме букв.']")
    private WebElement passwordValidationMessage;

    public BbcPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void enterUserNameAndPassword(String login, String password) {
        userName.sendKeys(login);
        userPassword.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean accountButtonPresent() {
        return accountNavButton.isDisplayed();
    }

    public boolean validationMessagePresent(){
        return passwordValidationMessage.isDisplayed();
    }
}
