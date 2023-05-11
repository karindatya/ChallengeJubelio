import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Persediaan extends env_target {

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
        Duration duration = Duration.ofSeconds(5);

        //step login
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("email"))
        );
        driver.findElement(By .name("email")).sendKeys("qa.rakamin.jubelio@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Jubelio123!");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/button")).click();

        //click barang
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By .xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[1]/h1"))
        );
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/a")).click();

        //click persediaan
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/ul/li[2]/a")).click();

        //verifiy penyesuaian persediaan
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/div/button[2]"))
        );

        //click penyesuaian persediaan
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/div/button[2]")).click();

        //pilih barang
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[1]"))
        );
        Actions actions = new Actions(driver);
        actions.doubleClick(
                driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[1]"))
        ).perform();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("selectivity-result-item"))
        );
        driver.findElement(By.className("selectivity-result-item")).click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");

        // fill qty
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[1]")).click();
        actions.doubleClick(
                driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[1]"))
        ).perform();
        driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[6]/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div")).click();


        // Click Simpan button
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[3]/div/button")).click();

        //verify element persediaan
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[1]/h1"))
        );

        driver.quit();
    }
}
