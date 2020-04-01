package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class L51_VipolnenieSlozhnihDeistviu {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");
        WebElement link = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()='Electronics']"));

        Actions actions = new Actions(driver);              // Позволяет навести мышку на элемент
        actions.moveToElement(link).build().perform();






    }
}
