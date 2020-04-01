package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class L46_CheckBox_RadioButton {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();



        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//button[@class='menu-toggler' and @aria-label='Каталог товаров']")).click();
        driver.findElement(By.xpath("//*[text()='Смартфоны, ТВ и электроника']")).click();
        driver.findElement(By.xpath("//a[text()=' Смартфоны и портативная техника ']")).click();
        driver.findElement(By.xpath("//span[text()=' Мобильные телефоны ']")).click();
        driver.findElement(By.xpath("//*[contains(@href,'strana-proizvoditelj-tovara-90098=544331')]")).click();


        driver.quit();


    }


}
