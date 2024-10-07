package com.siigo.certificacion.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilAngularIsReady;

import static com.siigo.certificacion.prueba.pages.FormularioCrearClientePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarFormularioCrearCliente implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());
        actor.attemptsTo(Switch.toFrame(0));
        actor.attemptsTo(WaitUntil.the(GUARDAR, isEnabled()));
    }

    public static ValidarFormularioCrearCliente validarFormularioCrearCliente(){
        return Tasks.instrumented(ValidarFormularioCrearCliente.class);
    }
}
