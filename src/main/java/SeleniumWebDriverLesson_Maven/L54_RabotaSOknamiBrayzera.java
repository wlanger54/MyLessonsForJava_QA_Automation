package SeleniumWebDriverLesson_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class L54_RabotaSOknamiBrayzera {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wlang\\IdeaProjects\\MyLessonsForJava\\drivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html");
        driver.findElement(By.xpath("//table[@class='downloadBox']//a[text()='Oracle Technology Network License Agreement for Oracle Java SE']")).click();

        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath("//a[@class='u28ham']")).click();

    }



}
