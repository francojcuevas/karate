Feature: :Post user on regres

  Background:
    * url "https://reqres.in"
    * path "/api/users/"
    * request { "name": "#(name)", "job": "#(job)" }

  Scenario Outline: post a user
 #   * def var = { "name": "chris", "job": "leader" }
    When method post
    Then status 201

    Examples:
    |name|job|
    |  Javier  | Programador  |
    |  Messi | leyenda |
    |  Milei  | presidente  |

  Scenario: post a user without a job
    When method post
    Then status 201

  Scenario: post a user with an invalid name
    When method post
    Then status 201