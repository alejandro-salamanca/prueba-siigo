package com.siigo.certificacion.prueba.pages;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioCrearClientePage {

    public static Target IFRAMEFORMULARIO = Target.the("iFrame Formulario").locatedBy("iframe#embedded-iframe");

    public static Target TITULOCREARCLIENTE = Target.the("Titulo Crear Cliente").locatedBy("#Default_ucControlPane0_ContainerTitle");

    public static Target INGRESOCORREO = Target.the("Ingreso Correo").locatedBy("#Default_ucControlPane0_ctl00_txtAccess");

    public static Target SELECCIONTIPOUSUARIO = Target.the("Seleccion Tipo Usuario").locatedBy("#Default_ucControlPane0_ctl00_ddlUserType");

    public static Target INGRESONOMBRES = Target.the("Ingreso Nombres").locatedBy("#Default_ucControlPane0_ctl00_txtNames");

    public static Target INGRESOAPELLIDOS = Target.the("Ingreso Apellidos").locatedBy("#Default_ucControlPane0_ctl00_txtLastNames");

    public static Target INGRESOIDENTIFICACION = Target.the("Ingreso Identificacion").locatedBy("#Default_ucControlPane0_ctl00_txtIdentification");

    public static Target INGRESOTELEFONOMOVIL = Target.the("Ingreso Telefono").locatedBy("#Default_ucControlPane0_ctl00_txtMobilePhone");

    public static Target SELECCIONCARGO = Target.the("Seleccion Cargo").locatedBy("#Default_ucControlPane0_ctl00_ddlCharge");

    public static Target GUARDAR = Target.the("Guardar").locatedBy("#Default_ucControlPane0_ctl00_btnSave");



}
