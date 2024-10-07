package com.siigo.certificacion.prueba.tasks;

import com.siigo.certificacion.prueba.pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.siigo.certificacion.prueba.pages.FormularioCrearClientePage.TITULOCREARCLIENTE;
import static com.siigo.certificacion.prueba.pages.HomePage.CREAR;
import static com.siigo.certificacion.prueba.pages.HomePage.CREARCLIENTES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrCrearCliente implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(CREAR, isEnabled()));
        actor.attemptsTo(Click.on(CREAR));
        actor.attemptsTo(Click.on(CREARCLIENTES));
    }

    public static IrCrearCliente irCrearCliente(){
        return Tasks.instrumented(IrCrearCliente.class);
    }
}
