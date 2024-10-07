Feature: Login Exitoso
  Yo como usuario
  Quiero hacer login
  Para ver mi sitio privado

  @Login
  Scenario: Login Exitoso
    Given Usuario ingresa a Pagina de Login
    When Usuario realiza Login con usuario "admin@siigoautomationqa.com" y password "(#T0Nu@QrO"
    Then Usuario ve correctamente el sitio privado
