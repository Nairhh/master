
@tag
Feature: Sign-Up
  Sign-up should be quick and friendly

  @tag3
  Scenario: Successfull sign-up
    Given Launch the Browser
    And  Launch the WebPage
    When Pass the username "harita" and  password "abc@123"
    Then User should Login

