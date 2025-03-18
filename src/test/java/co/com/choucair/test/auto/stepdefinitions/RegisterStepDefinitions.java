package co.com.choucair.test.auto.stepdefinitions;


import co.com.choucair.test.auto.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.choucair.test.auto.utils.EnvironmentConstants.client;
import static co.com.choucair.test.auto.utils.EnvironmentConstants.urlApp;

public class RegisterStepDefinitions {

    @Given("enter the url of the app")
    public void enterTheUrlApp(){
        OnStage.theActorCalled(client).wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }

    @When("login in with valid credentials")
    public void login(){
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials());
    }

    @When("navigate to Module PIM and creat new employee")
    public void navigate_to_module_pim_and_creat_new_employee() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("validate new employee")
    public void validate_new_employee() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
