package ljTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ShareTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
        driver.get("https://www.livejournal.com/");

        WebElement webElement = driver.findElement( By.xpath("//*[@id=\"js\"]/body/footer/div[2]/div[1]/div[1]/div[1]/ul/li[2]"));
        webElement.click();


        WebElement webElement1 = driver.findElement( By.xpath("//*[@id=\"js\"]/body/div[2]/div[4]/article/div/article/div/div[1]/footer/div/div[9]/a/span[1]"));
        webElement1.click();



    }


}
