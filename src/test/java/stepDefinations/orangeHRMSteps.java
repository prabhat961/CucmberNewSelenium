package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class orangeHRMSteps {
    WebDriver driver;
    @Given("Chrome Browser Launched")
    public void chrome_browser_launched() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @When("OrangeHRM page opened")
    public void orange_hrm_page_opened() {
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Then("Logo is verified on the login page")
    public void logo_is_verified_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("close Browser")
    public void close_browser() {
      driver.quit();
    }

}
