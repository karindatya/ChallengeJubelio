import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Persediaan extends env_target {
    @Test
    public void main () {
        //Set driverlocation path
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        //Maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set Url
        driver.get(baseUrl);
        driver.get("https://app.jubelio.com/login");
        Duration duration = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("email"))
        );
        driver.findElement(By .name("email")).sendKeys("qa.rakamin.jubelio@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Jubelio123!");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/button")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By .xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[1]/h1"))
        );
        driver.get("https://app.jubelio.com/home/inventory/");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/div/button[2]/span[1]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/h2"))
        );
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[1]")).click();

        Actions actions = new Actions(driver);
        actions.doubleClick(
                driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[1]"))
        ).perform();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("selectivity-result-item"))
        );
        driver.findElement(By.className("selectivity-result-item")).click();

        // Double click qty
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]")).click();
        actions.doubleClick(
                driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]"))
        ).perform();


//        // Input number 1 to qty
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-top\"]/div[5]/div/input"))
//        );
        driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[6]/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div")).click();

        // Click Simpan button
        driver.findElement(By.cssSelector("#page-wrapper > div.wrapper.wrapper-content > div > div > div > div:nth-child(2) > div > div > div > div > div:nth-child(6) > div > button > span.ladda-label")).click();



        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[1]/h1"))
        );


    }
}
