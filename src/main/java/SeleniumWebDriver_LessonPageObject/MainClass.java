package SeleniumWebDriver_LessonPageObject;

// Создан для проверки одного теста , на работоспособность методов

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MainClass {


    static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://github.com/");


        MainPage mainPage = new MainPage(driver);

        mainPage.register("Auto-Sergey", "wwwww@www.com","password1");







    }
}
