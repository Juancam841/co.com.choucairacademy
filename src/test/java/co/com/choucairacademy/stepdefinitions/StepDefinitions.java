package co.com.choucairacademy.stepdefinitions;

import co.com.choucairacademy.tasks.Login;
import co.com.choucairacademy.tasks.OpenUp;
import co.com.choucairacademy.tasks.Search;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class StepDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void than_brandon_wants_to_learn_automation_at_the_academy_choucair() {
        OnStage.theActorCalled("Brandon").attemptsTo(
                OpenUp.thePage(),
                Login.onThePage()
        );

    }

    @When("^he search for the course (.*) of the Choucair Academy Platform$")
    public void he_search_for_the_course_recursos_automatizacion_bancolombia_of_the_choucair_academy_platform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void he_finds_the_course_called_resources_recursos_automatizacion_bancolombia() {


    }
}
