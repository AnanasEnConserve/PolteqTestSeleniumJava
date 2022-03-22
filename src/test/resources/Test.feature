Feature: test


  @something
  Scenario: Something
    Given this should work
    #######################################

  @test
  Scenario: Click on sign up button
    Given I am on the homepage
    Then I should be able to click the button

  @test
  Scenario: Click on kleding
    Given I am on the homepage
    When I click on kleding
    Then Main header should be shown with the text "KLEDING"

  @test
  Scenario: Click on kleding
    Given I am on the homepage
    When I click on kunst
    Then Main header should be shown with the text "KUNST"

  @test
  Scenario: Click on kleding
    Given I am on the homepage
    When I click on accessoires
    Then Main header should be shown with the text "ACCESSOIRES"

  @test
  Scenario: Click on Polteq
    Given I am on the homepage
    When I click on Polteq
    Then Main header should be shown with the text "POLTEQ"