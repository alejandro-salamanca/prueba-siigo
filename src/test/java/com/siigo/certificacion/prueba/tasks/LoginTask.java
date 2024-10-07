package com.siigo.certificacion.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.siigo.certificacion.prueba.pages.LoginPage.*;


public class LoginTask implements Task {

    private String usuario;
    private String password;

    public LoginTask(String usuario){
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(USUARIO));
        actor.attemptsTo(Enter.theValue(password).into(PASSWORD));
        actor.attemptsTo(Click.on(INGRESAR));
    }

    public static LoginTask conUsuario(String usuario){
            return Tasks.instrumented(LoginTask.class, usuario);
    }

    public LoginTask yPassword(String password){
        this.password = password;
        return this;
    }

}
