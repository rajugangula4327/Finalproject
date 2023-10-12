#Author: raju
Feature: Signup Module Testing on Demo_blaze application

  Background: 
    Given user open the browser
    When user navigates to the URL

  @Edu_1
  Scenario: To verify the URL for Demo_blaze on Google browser
    And get URL & title of the Wabpage

  @Edu_2
  Scenario: To verify whether the site displays Greetings to the user
    And clicks on login
    And user inputs valid "mydemo@blaze.com" and "Demo@123"
    And clicks on login button
    Then the home page is displayed with welcome Username

  @Edu_3
  Scenario: To verify that the user redirects to the sign up page
    When user clicks on signup button
    Then signup dialog box should be displayed

  @Edu_4
  Scenario: To verify that the user redirects to the sign up page
    When user clicks on signup button
    Then signup dialog box should be displayed
    And Name field has to be visible
    And user inputs valid "mydemo@blaze.com"
