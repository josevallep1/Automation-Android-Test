package stepdefinitions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import actions.CalculatorActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CalculatorPageSteps {

  CalculatorActions calculatorActions = new CalculatorActions();

  @Given("I see calculator opened")
  public void I_see_calculator_opened() {
    calculatorActions.isCalculatorOpened();
  }

  @Then("^I verify that SUM of '(.*)' and '(.*)' equals to '(.*)'$")
  public void I_verify_sum(String a, String b, String result) {
    assertThat(String.format("Sum of %s and %s should be equal to %s", a, b, result),
        calculatorActions.sumOf(a, b),
        is(result));
  }
}