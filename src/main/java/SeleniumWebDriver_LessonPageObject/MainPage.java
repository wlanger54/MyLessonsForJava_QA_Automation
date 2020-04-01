package SeleniumWebDriver_LessonPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver ;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }



    private By signInButton = By.cssSelector(".HeaderMenu-link.mr-3");
    private By signUpButton = By.cssSelector(".HeaderMenu-link.rounded-1");
    private By userNameField = By.xpath("//input[@id='user[login]']");
    private By emailField = By.xpath("//input[@id='user[email]']");
    private By passwordField = By.xpath("//input[@id='user[password]']");
    private By singUpFormButton = By.xpath("//button[@class='btn-mktg btn-primary-mktg btn-large-mktg f4 btn-block my-3']");


    public LoginPage clickSignIn() {
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpButton() {
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSingUpFormButton() {
        driver.findElement(singUpFormButton).click();
        return new SignUpPage(driver);
    }

    public MainPage typeUserName(String username) {
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public MainPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public MainPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage register (String username, String email, String password) {
        this.typeUserName(username);
        this.typeEmail(email);
        this.typePassword(password);
        this.clickSingUpFormButton();
        return new SignUpPage(driver);
    }












}

