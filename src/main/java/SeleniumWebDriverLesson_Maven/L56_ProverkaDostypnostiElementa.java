package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class L56_ProverkaDostypnostiElementa {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        driver.manage().window().maximize();


/////
        driver.get("https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html");

        WebElement rb1 = driver.findElement(By.xpath("//input[@name='agreementjdk-13.0.2-oth-JPR'][1]"));
        WebElement rb2 = driver.findElement(By.xpath("//input[@name='agreementjdk-13.0.2-oth-JPR'][2]"));

        System.out.println("Radio button 2 selected : " + rb2.isSelected() );    // isSelected - метод который проверяет выбран ли радиобатон

        if (!rb1.isSelected()) rb1.click();

/////

        driver.get("https://www.ebay.com/");

        WebElement linki =  driver.findElement(By.xpath("//a[contains(text(),'Smart Home')]"));
        WebElement linki2 = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()= 'Electronics']"));

        System.out.println(linki.isDisplayed());      // isDisplayed -  проверяет виден ли элемент на странице
        System.out.println(linki2.isDisplayed());

        if (linki.isDisplayed()) linki.click();
        else linki2.click();


    }
}
