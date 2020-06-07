Feature: Testing some of the use cases for the practice website


  Scenario: Purchase printed dress
    Given I am on the automation practice online shop site
    When  I click on casual dresses
    And I add the printed dress to my cart
    And click on proceed to checkout
    Then I can see the printed dress in my cart
