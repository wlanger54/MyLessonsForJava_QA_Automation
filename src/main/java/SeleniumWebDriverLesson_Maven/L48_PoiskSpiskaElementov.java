package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.concurrent.TimeUnit;


public class L48_PoiskSpiskaElementov {




    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      // Не явное ожидание
        driver.manage().window().maximize();

        driver.get("https://www.foxtrot.com.ua/");
        driver.findElement(By.xpath("//div[@class='categories'] //a[text()='Смартфоны и планшеты']")).click();
        driver.findElement(By.xpath("//div[@class='categories__item']//a[text()='Смартфоны и мобильные телефоны']")).click();
        driver.findElement(By.xpath("//div[@data-property='9501']//img[@class='more__icon']")).click();


        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@data-property='9501']//a"));

//        checkboxes.get(2).click();    // Можем выбрать конкретный чекбокс


        if (checkboxes.size()==36) System.out.println("it's okay");      // Условие которое проверяет количество чекбоксов в блоке
        else System.out.println("FAIL !!!");

        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }





    }
}
