Feature: Registration

  @tag2
  Scenario Outline: Title of your scenario outline
    Given Application is launched
    When Enter correct credentials <username> and <password>
    Then Login should be successful

    Examples: 
      | username | password   |
      | mark3923 | testing123 |

  @Time_Entry
  Scenario Outline: Submit a time card
    Given Application is launched
    When Enter correct credentials <username> and <password>
    And User Selects Role <role>
    And User clicks <form>
    And User enters <time_period> and <project> and <task> and <hours>
    And User clicks Next
    And User Submits time_card
    Then Time card should be submitted sucessfully

    Examples: 
      | username | password   | role | form | time_period | project | task | hours |
      | mark3923 | testing123 | SST  | time |          20 |    1029 |  2.0 |     8 |
