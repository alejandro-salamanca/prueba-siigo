package com.siigo.certificacion.prueba.stepdefinition;

import com.siigo.certificacion.prueba.drivers.ChromeDriver;
import com.siigo.certificacion.prueba.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinition {

    @Before
    public void setUserName(){
        setTheStage(new Cast());
        theActorCalled("User");
    }

    @Given("Usuario ingresa a Pagina de Login")
    public void usuarioIngresaAPaginaDeLogin() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(ChromeDriver.chrome().conURL("https://qastaging.siigo.com/#/login")));
    }

    @When("Usuario realiza Login con usuario {string} y password {string}")
    public void usuarioRealizaLoginConUsuarioYPassword(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(LoginTask.conUsuario(usuario).yPassword(password));
    }

    @Then("Usuario ve correctamente el sitio privado")
    public void usuarioVeCorrectamenteElSitioPrivado() {
    }
}
