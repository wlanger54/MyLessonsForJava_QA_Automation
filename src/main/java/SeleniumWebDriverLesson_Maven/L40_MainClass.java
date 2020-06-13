package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class L40_MainClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MavenTestProject\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     // Ожидает 10 секунд если не успела подгрузиться страница

        driver.manage().window().maximize();                    // Делает окно на весь экран


        driver.navigate().refresh();driver.get("https://www.pkwteile.at");                  // 1й способ открытия браузера (лучший способ)
        driver.navigate().to("https://www.google.com/");     // 2й способ открытия браузера

        driver.navigate().back();
        driver.navigate().forward();

        System.out.println(driver.getTitle());        // Выводит в консоле тайтл страницы
        System.out.println(driver.getCurrentUrl());




        driver.quit();



    }

}
