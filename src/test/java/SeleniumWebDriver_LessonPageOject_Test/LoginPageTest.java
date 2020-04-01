package SeleniumWebDriver_LessonPageOject_Test;

import SeleniumWebDriver_LessonPageObject.LoginPage;
import SeleniumWebDriver_LessonPageObject.SignUpPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;



    @Before
    public void  setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        loginPage  = new LoginPage(driver);
    }

    @Test
    public void loginWithEmptyCredsTest() {
        LoginPage newLoginPage = loginPage.loginWithInvalidCreds("", "");
        String error = newLoginPage.getErrorText();
        Assert.assertEquals("Incorrect username or password.", error);
    }


    @Test
    public void  loginWithIncorrectCredsTest() {
        LoginPage newLoginPage = loginPage.loginWithInvalidCreds("Sergey-Auto", "Sergey12345");
        String error = newLoginPage.getErrorText();
        Assert.assertEquals("Incorrect username or password.", error);
    }


    @Test
    public void CreateAccTest() {
        SignUpPage signUpPage = loginPage.createAccount();
        String heading = signUpPage.getHeadingText();
        Assert.assertEquals("Create your account", heading);
    }








    @After
    public void tearDown () {
        driver.quit();
    }



}
