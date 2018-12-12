## CONNECT.IT Meetup: Automation Testing Recipes

This project contains reference models and use case examples used during 
[Connect.IT Meetup presentation](https://www.meetup.com/Connect-IT-Meetup-in-Chisinau/events/251228042/)
on how to **_Decouple business logic by breaking down the data objects_**

The project uses a banking transfer domain to perform a simple transfer of found between two accounts.

Bellow is the scenario overview:

```gherkin
    Feature: Credit transfer
  
    Scenario: Fund transfer between active accounts
  
      Given J.P. Morgan bank has an active account with number 100001
      And HSBC bank has an active account with number 200001
      When John initiates a credit transfer from account 100001 to account 200001
      Then credit transfer is submitted for approval
```

