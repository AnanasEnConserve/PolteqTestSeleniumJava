Feature: Test API with cucumber and RestAssured

  @api
  Scenario: Log in with valid credentials - expect 200
    Given I log in with valid credentials
    Then I should get a 200 response

##################################################################

  @api
  Scenario: Log in with invalid credentials - expect 401
    Given I log in with invalid credentials
    Then I should get rejected and receive a 401 response
