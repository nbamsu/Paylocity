package PalocityStepDefs;

import PaylocityPage.LoginPage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {
    LoginPage page = new LoginPage();
    WebDriver driver= Driver.getDriver();



    @Given("user navigate to webpage")
    public void user_navigate_to_webpage() {
    driver.get(ConfigReader.getProperty("url"));
    }

    @Given("user enter username {string} {string}")
    public void user_enter_username(String userName, String password) {
    page.username.sendKeys(userName);
    page.password.sendKeys(password);

    }

    @Given("user click login button")
    public void user_click_login_button() {
    page.loginButton.click();
    }
    @Given("user have to validate error message")
    public void user_have_to_validate_error_message() {
        String expectedMessage="Invalid login attempt. Please try again.";
        String actualMessage=page.errorMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    @Given("user enter username {string} and password {string}")
    public void user_enter_username_and_password(String userName, String password) {
       page.username.sendKeys(userName);
       page.password.sendKeys(password);
       //page.loginButton.click();
    }

    @Given("user have to validate homepage header")
    public void user_have_to_validate_homepage_header() {
        String expectedTitle="Benefits Dashboard";
        String actualTitle=page.headerTitle.getText();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Given("user have to validate error message {string}")
    public void user_have_to_validate_error_message(String expected) {
      String actual=page.errorMessage.getText();
      Assert.assertEquals(actual,expected);
    }
}
