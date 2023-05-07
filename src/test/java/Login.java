import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login extends env_target {
    @Test
    public void main () {
        //Set driverlocation path
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        //Maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set Url
        driver.get(baseUrl);
        driver.get("https://app.jubelio.com/login");
        Duration duration = Duration.ofSeconds(2);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By .xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/button"))
        );

        //input email, password dan click button masuk
        driver.findElement(By .name("email")).sendKeys("qa.rakamin.jubelio@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Jubelio123!");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/button")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By .xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[1]/h1"))
        );


    }
}
