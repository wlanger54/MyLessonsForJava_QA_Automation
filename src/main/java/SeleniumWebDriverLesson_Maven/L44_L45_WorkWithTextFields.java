package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class L44_L45_WorkWithTextFields {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://ru.wikipedia.org/");
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value"));     //Выводит в консоль то что было прописано в поле перд очисткой
        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear();


//        Урок 45 - Работа с ссылками

        WebElement link = driver.findElement(By.xpath("//li[@id='n-portal']/a"));
        System.out.println(link.getText());
        link.click();




    }
}
