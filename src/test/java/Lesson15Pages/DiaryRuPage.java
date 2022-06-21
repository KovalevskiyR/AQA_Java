package Lesson15Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiaryRuPage {

    @FindBy(xpath = "//input[@id='signupform-username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='signupform-email']")
    private WebElement userEmail;

    @FindBy(xpath = "//input[@id='chk_box_user_confirm']")
    private WebElement checkBox;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg']")
    private WebElement submitButton;

    @FindBy(xpath = "//li[@class='avatar']/a")
    private WebElement title;

    @FindBy(xpath = "//div[@class='form-group field-signupform-username required has-error']/p")
    private WebElement validationLabel;

    public DiaryRuPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputNameAndEmail(String name, String email) {
        userName.sendKeys(name);
        userEmail.sendKeys(email);
    }

    public void markCheckbox() {
        checkBox.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean titlePresent() {
        return title.isDisplayed();
    }

    public boolean validationLabelPresent() {
        return validationLabel.isDisplayed();
    }
}
