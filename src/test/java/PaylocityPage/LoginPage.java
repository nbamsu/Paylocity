package PaylocityPage;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@name='form-username']")
    public WebElement username;
    @FindBy(xpath = "//input[@name='form-password']")
    public WebElement password;
    @FindBy(id = "btnLogin")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@id='validation-errors']")
    public WebElement errorMessage;
    @FindBy(xpath = "//h1")
    public WebElement headerTitle;
}
