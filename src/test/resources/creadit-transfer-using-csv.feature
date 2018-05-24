Feature: Credit transfer

  Scenario: Fund transfer between active and inactive account

    Given J.P. Morgan bank has an active account with number 100001
    And HSBC bank has an inactive account with number 200001
    When John initiates a credit transfer with details creditTransfer1/credit-transfer.csv
    Then credit transfer is submitted for approval