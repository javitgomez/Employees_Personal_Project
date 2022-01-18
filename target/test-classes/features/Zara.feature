Feature:  let's go on sale at Zara

  Scenario: Purchase a perfume
    Given User enter
    When User click on login
    When User goes to perfume
    When User goes to the last purchase screen
    Then User logout

  Scenario: Purchase a bag
    When User click on login
    When User goes to bag
    When User goes to the last one purchase screen
    Then User logout



