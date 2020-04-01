package SeleniumWebDriver_LessonPageOject_Test;

import SeleniumWebDriver_LessonPageObject.SignUpPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUpPageTest {

    private WebDriver driver;
    private SignUpPage signUpPage;



    @Before
    public void  setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/join");
        signUpPage  = new SignUpPage(driver);
    }


    @Test
    public void signUpReservedUsernameTest() {
        SignUpPage sp = signUpPage.typeUserName("Username");
        String error = sp.getUserNameErrorText();
        Assert.assertEquals("Username 'Username' is unavailable.", error);

    }


    @Test
    public void signUpHeaderTest() {
        String sp2 = signUpPage.getHeadingText();
        Assert.assertEquals("Create your account", sp2);
    }


 











    @After
    public void tearDown () {
        driver.quit();
    }


}
