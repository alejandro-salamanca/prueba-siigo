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
import static com.siigo.certificacion.prueba.pages.HomePage.CREAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarFormularioCrearCliente implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(CREAR, isEnabled()));
        actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());
        actor.attemptsTo(Switch.toFrame(0));
        actor.attemptsTo(SelectFromOptions.byVisibleText("Con acceso").from(SELECCIONTIPOUSUARIO));
        actor.attemptsTo(Click.on(INGRESOCORREO));
        actor.attemptsTo(Enter.theValue("alejandro@hotmail.com").into(INGRESOCORREO));
        actor.attemptsTo(Click.on(INGRESONOMBRES));
        actor.attemptsTo(Enter.theValue("Alejandro").into(INGRESONOMBRES));
        actor.attemptsTo(Click.on(INGRESOAPELLIDOS));
        actor.attemptsTo(Enter.theValue("Salamanca").into(INGRESOAPELLIDOS));
        actor.attemptsTo(Click.on(INGRESOIDENTIFICACION));
        actor.attemptsTo(Enter.theValue("1010203490").into(INGRESOIDENTIFICACION));
        actor.attemptsTo(Click.on(INGRESOTELEFONOMOVIL));
        actor.attemptsTo(Enter.theValue("3204395867").into(INGRESOTELEFONOMOVIL));
        actor.attemptsTo(SelectFromOptions.byVisibleText("1. Contador").from(SELECCIONCARGO));
    }

    public static ValidarFormularioCrearCliente validarFormularioCrearCliente(){
        return Tasks.instrumented(ValidarFormularioCrearCliente.class);
    }
}
