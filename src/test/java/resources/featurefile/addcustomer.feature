Feature: Add Customer Functionality

  As a user I should be able to add Customer Successfully

  Background:
    Given I am on Homepage
    Given I click on Bank Manager Login Tab
    Given I click on Add Customer Tab
    Given I enter FirstName "Iron"
    Given I enter LastName "Man"
    Given I enter PostCode "WD23 4HR"
    Given I click on Add Customer Button
    Given I should see message "Customer added successfully"
    Given I should able to accept popup



  @Sanity
  Scenario:  User should be able to open Account Successfully
    When I click on Open Account tab
    And  I search customer from DropDown
    And  I select currency from DropDown
    And  I click on process button
    Then I should see the message "Account created successfully"
    And  I should be able to accept pop up


    @Smoke
    Scenario: User should log in and log out Successfully
      When I click on Home button
      And  I click on Customer Login tab
      And  I search customer from DropDown
      And  I click on Login Button
      Then  I should see "Logout" tab displayed
      And I should be able to click on Log out tab
      And I should see "Your Name" text displayed

      @Regression
      Scenario: User Should deposit money Successfully
        When I click on Home button
        And I click on Customer Login button
        And I search customer from DropDown
        And I click on Login Button
        And I click on Deposit tab
        And I enter amount "100"
        And I click on Deposit button
        Then I should see a message "Deposit Successful"

        @Regression
        Scenario: User Should withdraw money Successfully
          When I click on Home button
          And I click on Customer Login button
          And I search customer from DropDown
          And I click on Login Button
          And I click on Deposit tab
          And I enter amount "100"
          And I click on Deposit button
          And I click on Withdrawl tab
          And I enter  Withdrawl amount "50"
          And I click on Withdraw button
          Then I should able to see message "Transaction Successful"

