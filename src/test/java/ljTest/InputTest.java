package ljTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class InputTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
       options.addArguments("--incognito");
       options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
       driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
        driver.get("https://www.livejournal.com/");

        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[4]/div[1]/section[3]/div/div/form/div/input"));
        webElement2.sendKeys("Ivan-test-81", Keys.ENTER);
    }

}
