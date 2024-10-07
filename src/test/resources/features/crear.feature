Feature: Crear Clientes
  Yo como usuario
  Quiero hacer ir al formulario de Crear Clientes
  Para ver los datos que solicita el formulario

  @Login
  Scenario: Ir al Formulario Crear Clientes
    Given Usuario ingresa a Pagina de Login
    When Usuario realiza Login con usuario "admin@siigoautomationqa.com" y password "(#T0Nu@QrO"
    And Usuario navega al formulario Crear Clientes
    Then Usuario ve correctamente el formulario Crear Clientes
