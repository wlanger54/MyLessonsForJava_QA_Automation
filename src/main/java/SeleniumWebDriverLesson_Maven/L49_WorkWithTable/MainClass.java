package SeleniumWebDriverLesson_Maven.L49_WorkWithTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MainClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\MavenTestProject\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();



        driver.get("https://www.w3schools.com/html/html_tables.asp");

        WebElement tableElement = driver.findElement(By.xpath("//table[@id='customers']"));

        Table table = new Table(tableElement, driver);

        System.out.println("Rows number is : " + table.getRows().size());

        System.out.println(table.getValueFromCell(2, 3));
        System.out.println(table.getValueFromCell(4, 1));

        System.out.println(table.getValueFromCell(4, "Company"));
        System.out.println(table.getValueFromCell(1, "Country"));
        System.out.println(table.getValueFromCell(2, "Contact"));







    }
}
