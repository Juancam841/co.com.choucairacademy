@stories
Feature: Academy Choucair
  As a user, I want to lear how to automate in Screenplay at the Choucair Academy with the automation course

  @Scenario1
  Scenario Outline: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair <user> <pass>
    When he search for the course <course> of the Choucair Academy Platform
    Then he finds the course called resources <course>

    Examples:
      | course                    | user    | pass          |
      | Turbito Testing Servicios | jvillac | Choucair2022* |


