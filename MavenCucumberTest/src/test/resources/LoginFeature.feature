#Author: manojkumar.munuswamy@equiniti.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: EQ Global Login Test

  @tag1
  Scenario Outline: Login into EQGlobal
    Given The site <Url>
    And Navigate to Login page
    When I Enter <Username> and <Password>
    And Enter the Six Digit <MFA> Code
    And Click on Login
    Then Home Page Displayed
    And Verify the UserName
    And Close the window
    And Test

    Examples: 
      | Url                                           | Username                   | Password        | MFA      |
      | "https://testeqglobal.uk1test.group.internal" | "neil.kinnon@equiniti.com" | "Version1.22!!" | "000000" |
      | "https://testeqglobal.uk1test.group.internal" | "neil.kinnon@equiniti.com" | "Version1.22!!" | "000000" |
      | "https://testeqglobal.uk1test.group.internal" | "neil.kinnon@equiniti.com" | "Version1.22!!" | "000000" |
