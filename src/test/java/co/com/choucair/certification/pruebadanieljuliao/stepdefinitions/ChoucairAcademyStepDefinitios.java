package co.com.choucair.certification.pruebadanieljuliao.stepdefinitions;

import co.com.choucair.certification.pruebadanieljuliao.tasks.OpenUp;
import co.com.choucair.certification.pruebadanieljuliao.tasks.SignUp;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitios {
   @Before
    public  void setStage(){
        OnStage.setTheStage(new OnlineCast());
   }

    @Given("^Daniel wants to register in utest$")
    public void danielWantsToRegisterInUtest() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePade(),(SignUp.theRegister()));

    }

    @When("^he starts his registration$")
    public void heStartsHisRegistration() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^he completes his registration correctly$")
    public void heCompletesHisRegistrationCorrectly() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
