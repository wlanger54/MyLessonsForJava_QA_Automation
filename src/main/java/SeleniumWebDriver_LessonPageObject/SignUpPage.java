package SeleniumWebDriver_LessonPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    private By heading = By.xpath("//div[@class='mb-4 mb-md-8 container-md']/h1");
    private By userNameField = By.xpath("//input[@id='user_login']");
    private By emailField = By.xpath("//input[@id='user_email']");
    private By passwordField = By.xpath("//input[@id='user_password']");
    private By signUpButton = By.xpath("//button[@id='signup_button']");

    private By mainError = By.xpath("//div[@class='flash flash-error my-3']");
    private By userNameError = By.xpath("(//dd[@class='error'])[1]");
    private By emailError = By.xpath("(//dd[@class='error'])[2]");
    private By passwordError = By.xpath("(//dd[@class='error'])[3]");



    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public SignUpPage typeUserName(String username) {
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public SignUpPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage registerWithInvalidCreds (String username, String email, String password){
        this.typeUserName(username);
        this.typeEmail(email);
        this.typePassword(password);
        driver.findElement(signUpButton).click();
        return  new SignUpPage(driver);
    }

    public String getMainErrorText() {
        return driver.findElement(mainError).getText();
    }

    public String getUserNameErrorText() {
        return driver.findElement(userNameError).getText();
    }

    public String getEmailErrorText() {
        return driver.findElement(emailError).getText();
    }

    public String getPasswordErrorText() {
        return driver.findElement(passwordError).getText();
    }





}