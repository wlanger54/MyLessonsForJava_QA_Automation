package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class L47_VipadayshieSpiski {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://test.pkwteile.at/autozubehoer/schneeketten");

        driver.findElement(By.xpath("//label[text()='Breite']/following-sibling::div/select[@name='snow-chains-filter[width]']")).click();
        driver.findElement(By.xpath("//option[@value='145']")).click();

        driver.findElement(By.xpath("//label[text()='Höhe']/following-sibling::div/select[@name='snow-chains-filter[cross-sections]']")).click();
        driver.findElement(By.xpath("//option[@value='60']")).click();


        driver.findElement(By.xpath("//span[text()='Suchen']")).click();

        driver.quit();


    }
}
