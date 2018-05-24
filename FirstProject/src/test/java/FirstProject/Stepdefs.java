package FirstProject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

class IsItFriday {
    static String isItFriday(String today) {

        if(today == "Friday"){
            return "Yep";
        }
        else return "Nope";

    }
}

public class Stepdefs {
    private String today;
    private String actualAnswer;

    @Given("^today is Monday$")
    public void today_is_Monday() {
        this.today = "Monday";
    }

    @Given("^today is Tuesday$")
    public void today_is_Tuesday() {
        this.today = "Tuesday";
    }

    @Given("^today is Wednesday$")
    public void today_is_Wednesday() {
        this.today = "Wednesday";
    }

    @Given("^today is Thursday$")
    public void today_is_Thursday() {
        this.today = "Thursday";
    }

    @Given("^today is Friday$")
    public void today_is_Friday() {
        this.today = "Friday";
    }

    @Given("^today is Saturday$")
    public void today_is_Saturday() {
        this.today = "Saturday";
    }

    @Given("^today is Sunday$")
    public void today_is_Sunday() {
        this.today = "Sunday";
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_is_s_Friday_yet() {
        this.actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}