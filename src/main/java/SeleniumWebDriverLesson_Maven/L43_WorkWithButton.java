package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class L43_WorkWithButton {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\wlang\\IdeaProjects\\MavenTestProject\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        // Способ 1

        driver.get("https://ru.wikipedia.org/");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();


        // Способ 2 (submit)

        driver.get("https://github.com/");
        WebElement button = driver.findElement(By.xpath("//form[@class='home-hero-signup text-gray-dark js-signup-form']//button"));

        if(button.getText().equals("Sign up for GitHub")) {
            System.out.println("Success !! ");
        }
        else System.out.println("FAil !!!");

        System.out.println("Button text is: " + button.getText());     // Выводит в консоль текст

        button.submit();












    }
}
