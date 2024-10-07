package com.siigo.certificacion.prueba.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class LoginPage {

    public static Target USUARIO = Target.the("Usuario").located(ByShadow.cssSelector("#username-input","#username"));

    public static Target PASSWORD = Target.the("Password").located(ByShadow.cssSelector("#password-input","#current-password"));

    public static Target INGRESAR = Target.the("Ingresar").locatedBy("#login-submit");



}
