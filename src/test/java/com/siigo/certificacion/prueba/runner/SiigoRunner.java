package com.siigo.certificacion.prueba.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        snippets = CAMELCASE,
        glue = "com.siigo.certificacion.prueba.stepdefinition")

public class SiigoRunner {
}
