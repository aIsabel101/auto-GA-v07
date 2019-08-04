Feature: Picocontainer

  Scenario: Test Picocontainer
    Given I have n things in my belly
    When Login "admin@phptravels.com" and "demoadmin"
    Then The user should be "SUPER ADMIN"
