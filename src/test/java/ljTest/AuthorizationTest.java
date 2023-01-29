package ljTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AuthorizationTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");

        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"user\"]"));
        webElement2.sendKeys("Ivan-test-81");

        WebElement webElement3 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/form[1]/div/div[2]/div/input"));
        webElement3.sendKeys("3D*N#mP8@FyiET4");

        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div/div[2]/form[1]/button"));
        webElement4.click();

        //driver.quit();

       }
}
