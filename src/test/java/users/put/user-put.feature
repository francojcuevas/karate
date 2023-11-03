Feature: :put user on regres

  Scenario: put a user
    Given url "https://reqres.in" + "/api/users/" + "2"
    And request { "name": "ramiro", "job": "zion resident" }
    When method put
    Then status 200
    And match $.name == 'ramiro'