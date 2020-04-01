package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class L58_ImitaciyaNajatiyaKlavishKlaviatyri {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.ebay.com/");

        WebElement searchInput =  driver.findElement(By.xpath("//div[@id='gh-ac-box2']//input"));

//        searchInput.sendKeys(Keys.chord(Keys.SHIFT, "Samsung"));   // Метод chord который имитирует сочитание клавиши SHIFT и Sumsung пропишеться большими буквами !
//        searchInput.sendKeys("Samsung");
//        searchInput.sendKeys(Keys.ENTER);

/////

        String select = Keys.chord(Keys.CONTROL, "a");
        String cut = Keys.chord(Keys.CONTROL, "x");
        String paste = Keys.chord(Keys.CONTROL, "v");

        searchInput.sendKeys("Test Text");
        searchInput.sendKeys(select);
        searchInput.sendKeys(cut);
        searchInput.sendKeys(paste);
        searchInput.sendKeys(Keys.ENTER);












    }
}
