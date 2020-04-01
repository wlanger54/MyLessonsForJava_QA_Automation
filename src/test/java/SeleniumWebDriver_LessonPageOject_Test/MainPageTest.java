package SeleniumWebDriver_LessonPageOject_Test;

import SeleniumWebDriver_LessonPageObject.LoginPage;
import SeleniumWebDriver_LessonPageObject.MainPage;
import SeleniumWebDriver_LessonPageObject.SignUpPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MainPageTest  {

    private WebDriver driver;
    private MainPage mainPage;



    @Before
    public void  setUp () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        mainPage = new MainPage(driver);
    }


    @Test
    public  void  sigInTest() {
        LoginPage loginPage = mainPage.clickSignIn();
        String heading = loginPage.getHeadingText();
        Assert.assertEquals("Sign in to GitHub", heading);
    }

    @Test
    public void registerFailTest() {
        SignUpPage signUpPage = mainPage.register("Auto-Sergey", "wwwww@www.com", "password1");
        String error = signUpPage.getMainErrorText();
        Assert.assertEquals("There were problems creating your account.", error);
    }

    @Test
    public  void  signUpEmptyUsernameTest() {
        SignUpPage signUpPage = mainPage.register("", "wwwww@www.com", "password1");
        String error = signUpPage.getUserNameErrorText();
        Assert.assertEquals("Username can't be blank", error);
    }

    @Test
    public  void  signUpInvalidEmailTest() {
        SignUpPage signUpPage = mainPage.register("", "wertyyu", "");
        String error = signUpPage.getEmailErrorText();
        Assert.assertEquals("Email is invalid or already taken", error);
    }





    @After
    public void tearDown() {
        driver.quit();
    }





}
