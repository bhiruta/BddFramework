Feature:NopCommerce Registration
Background:
  Given User able to open Browser
  And  Enter Url

  Scenario:NopCommerce Valid Registration Page
   When User Click on Register Button
    And User enter Firstname and Lastname
    And User enter Date of Birth
    And User enter email
    And User enter Companyname
    And User click on Newsletter field
    And User enter password
    And User enter confirm password
    And User Click on Submit button
    Then User should see a welcome page





