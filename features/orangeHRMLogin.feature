Feature: OrangeHRM login
  Scenario: Logo present on OrangeHRM login Page
    Given Chrome Browser Launched
    When OrangeHRM page opened
    Then Logo is verified on the login page
    And close Browser

