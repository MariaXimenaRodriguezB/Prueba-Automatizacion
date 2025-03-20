package co.com.choucair.test.auto.stepdefinitions;


import co.com.choucair.test.auto.models.SetData;
import co.com.choucair.test.auto.questions.QuestionRegister;
import co.com.choucair.test.auto.tasks.Login;
import co.com.choucair.test.auto.tasks.RegisterNewEmployee;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.choucair.test.auto.utils.EnvironmentConstants.client;
import static co.com.choucair.test.auto.utils.EnvironmentConstants.urlApp;

public class RegisterStepDefinitions {

    private final SetData setData = new SetData();

    @Given("enter the url of the app")
    public void enterTheUrlApp(){
        OnStage.theActorCalled(client).wasAbleTo(Open.url(urlApp));
    }

    @When("login in with valid credentials")
    public void login(){
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials());
    }

    @When("navigate to Module PIM and create new employee")
    public void createeNewEmployee(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterNewEmployee.register(setData.setDataRegister(dataTable).get(0)));
    }

    @Then("validate new employee")
    public void validateNewEmployee() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(QuestionRegister.value()));
    }

}
