package com.siigo.certificacion.prueba.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class HomePage {

    public static Target CREAR = Target.the("Crear").located(ByShadow.cssSelector("button","siigo-header-molecule[class='data-siigo-five9 hydrated']","siigo-button-atom[data-id='header-create-button']"));
    public static Target CREARCLIENTES = Target.the("Crear Clientes").located(ByShadow.cssSelector("a[data-value='Usuario']","siigo-header-molecule[class='data-siigo-five9 hydrated']"));

}
