package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.env_target;
import java.time.Duration;

public class LoginBdd extends env_target {
    @Given("User is in login page")
    public void userIsInLoginPage() {
        //Set driverlocation path
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        //Maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set Url
        driver.get(baseUrl);
        driver.get("https://app.jubelio.com/login");
        Duration duration = Duration.ofSeconds(2);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/button"))
        );
    }

    @When("User fill email and password")
    public void userFillEmailAndPassword() {
        driver.findElement(By .name("email")).sendKeys("qa.rakamin.jubelio@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Jubelio123!");
    }

    @And("User click masuk button")
    public void userClickMasukButton() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/button")).click();
    }

    @Then("User verify login result")
    public void userVerifyLoginResult() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By .xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[1]/h1"))
        );

    }
}
