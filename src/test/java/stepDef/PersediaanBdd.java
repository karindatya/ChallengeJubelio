package stepDef;

import config.env_target;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PersediaanBdd extends env_target {

    @And("User click barang")
    public void userClickBarang() {
        //click barang
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/a")).click();
    }

    @And("User click persediaan")
    public void userClickPersediaan() {
        //click persediaan
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/ul/li[2]/a")).click();
    }

    @And("User verify penyesuaian persediaan")
    public void userVerifyPenyesuaianPersediaan() {
        //verifiy penyesuaian persediaan
        Duration duration = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/div/button[2]"))
        );
    }

    @And("User click penyesuaian persediaan")
    public void userClickPenyesuaianPersediaan() {
        //click penyesuaian persediaan
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/div/button[2]")).click();
    }

    @And("User choose product")
    public void userChooseProduct() {
        //pilih barang
        Duration duration = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(driver, duration);
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
    }

    @And("User fill quantity")
    public void userFillQuantity() {
        // fill qty
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]")).click();
        Actions actions = new Actions(driver);
        actions.doubleClick(
                driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]"))
        ).perform();
        driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[6]/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div")).click();
    }

    @And("User click simpan button")
    public void userClickSimpanButton() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");

        // Click Simpan button
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[3]/div/button")).click();
    }

    @Then("User redirect to persediaan page")
    public void userRedirectToPersediaanPage() {
        Duration duration = Duration.ofSeconds(2);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[1]/h1"))
        );
    }
}
