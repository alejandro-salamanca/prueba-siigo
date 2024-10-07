package com.siigo.certificacion.prueba.stepdefinition;

import com.siigo.certificacion.prueba.tasks.IrCrearCliente;
import com.siigo.certificacion.prueba.tasks.ValidarFormularioCrearCliente;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.siigo.certificacion.prueba.tasks.IrCrearCliente.irCrearCliente;
import static com.siigo.certificacion.prueba.tasks.ValidarFormularioCrearCliente.validarFormularioCrearCliente;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearClienteStepDefinition {
    @And("Usuario navega al formulario Crear Clientes")
    public void usuarioNavegaAlFormularioCrearClientes() {
        theActorInTheSpotlight().attemptsTo(irCrearCliente());
    }

    @Then("Usuario ve correctamente el formulario Crear Clientes")
    public void usuarioVeCorrectamenteElFormularioCrearClientes() {
        theActorInTheSpotlight().attemptsTo(validarFormularioCrearCliente());
    }
}
