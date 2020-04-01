package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class L42_PoiskElementov {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MavenTestProject\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();



        driver.get("https://ru.wikipedia.org/");

        WebElement link = driver.findElement(By.linkText("Войти"));
        WebElement link2 = driver.findElement(By.partialLinkText("Сообщить об"));

        WebElement searchField = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.className("searchButton"));
        WebElement li = driver.findElement(By.id("ca-viewsource"));
        WebElement logo = driver.findElement(By.xpath("//div[@id='mw-panel']/div[@id='p-logo']//a"));


        driver.quit();


    }
}
