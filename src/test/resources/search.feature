Feature: search
  Scenario: do search
    Given i am on a homepage
    When i do search for a product " "
    Then i should be see a respective product