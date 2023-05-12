Feature: Plan de pruebas Franco Cuevas desafio

  @TEST_XRAY1-4 @TESTPLAN_XRAY1-10
  Scenario: Ingreso a la seccion de proximos eventos en Tsoft
    Given Ingresar a la pagina
    When selecciono proximo eventos
    And se visualiza los proximos eventos de tsoft
    Then vuelvo a home

  @TEST_XRAY1-5 @TESTPLAN_XRAY1-10
  Scenario: Visualizar articulos de expertos en la pagina de tsoft inspiracion
    Given Ingresar a la pagina
    When selecciono inspiracion
    And se selecciona articulos de expertos
    Then se elige el articulo super analista

  @TEST_XRAY1-6 @TESTPLAN_XRAY1-10
  Scenario: Visualizar el articulo de reconocimiento de Atlassian
    Given Ingresar a la pagina
    When se elige partners
    And se selecciona Attlasian
    Then se clickea el boton decubrelo aqui