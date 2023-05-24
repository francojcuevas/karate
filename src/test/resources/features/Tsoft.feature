Feature: Plan de pruebas Franco Cuevas desafio

  @XRAY1-46 @TESTPLAN_XRAY1-49
  Scenario: Ingreso a la seccion de proximos eventos en Tsoft
    Given Ingresar a la pagina
    When selecciono proximo eventos
    And se visualiza los proximos eventos de tsoft
    Then vuelvo a home

  @XRAY1-47 @TESTPLAN_XRAY1-49
  Scenario: Visualizar articulos de expertos en la pagina de tsoft inspiracion
    Given Ingresar a la pagina
    When selecciono inspiracion
    And se selecciona articulos de expertos
    Then se elige el articulo super analista

  @XRAY1-48 @TESTPLAN_XRAY1-49
  Scenario: Visualizar el articulo de reconocimiento de Atlassian
    Given Ingresar a la pagina
    When se elige partners
    And se selecciona Attlasian
    Then se clickea el boton decubrelo aqui