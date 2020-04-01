package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class L52_Vipolnenie_JavaScript {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)","");       // Скролим страницу вниз
        jse.executeScript("window.scrollBy(0,-1000)","");      // Скролим страницу вверх

//        jse.executeScript("alert('Hello World !!')");                    // Выводит сообшение на экран
    }
}
