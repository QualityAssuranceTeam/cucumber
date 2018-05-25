package CalculatorTests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

public class Stepdefs {

    private Integer a;
    private Integer b;
    int sum;

    @Given("^a is \"([^\"]*)\" and b is \"([^\"]*)\"$")
    public void a_is_and_b_is(String arg0, String arg1) {

        this.a = Integer.parseInt(arg0);
        this.b = Integer.parseInt(arg1);

    }

    @When("^I sum up a and b$")
    public void sum_a_and_b() {

        this.sum = Calculator.sumNumbers(a,b);

    }

    @Then("^I get \"([^\"]*)\"$")
    public void i_get(String expectedResult) {

        assertEquals(Integer.parseInt(expectedResult), this.sum);

    }

}