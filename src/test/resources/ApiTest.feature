Feature: Test API with cucumber and RestAssured

  @api
  Scenario: Log in with valid credentials - expect 200
    Given I log in with valid credentials
    Then I should get a 200 response