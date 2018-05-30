package SeleniumCucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;

public class Stepdefs {

    private WebDriver driver;
    String baseUrl = "https://lab.uk.qateam.eu/wp-login.php";
    String validUsename = "admin";
    String validPass = "Test1234";
    String expectedURL = "https://lab.uk.qateam.eu/wp-admin/";

    @Given("^I am on the QAteam homepage$")
    public void i_am_on_the_qateam_homepage() {

        System.setProperty("webdriver.chrome.driver", "..\\..\\drivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @When("^I enter valid username and password$")
    public void i_login() {

        WebElement usernameField = driver.findElement(By.id("user_login"));
        usernameField.sendKeys(validUsename);

        WebElement passwordField = driver.findElement(By.id("user_pass"));
        passwordField.sendKeys(validPass);

    }

    @And("^click on the submit button$")
    public void click_on_the_submit_button() {

        WebElement loginButton = driver.findElement(By.name("wp-submit"));
        loginButton.click();

    }

    @Then("^I should see Admin$")
    public void i_should_see_admin() {

        assertEquals(
                expectedURL,
                driver.getCurrentUrl()
        );

        WebElement displayName = driver.findElement(By.className("display-name"));

        assertEquals(
                validUsename,
                displayName.getText()
        );
    }

    @And("^close the browser$")
    public void quit() {

        driver.quit();
    }

}