Feature: Credit transfer

  Scenario: Funds transfer between active accounts

    Given J.P. Morgan bank has an active account with number 100001
    And HSBC bank has an active account with number 200001
    When John initiates a credit transfer from account 100001 to account 200001
    Then credit transfer is submitted for approval