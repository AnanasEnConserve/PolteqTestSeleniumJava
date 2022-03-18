Feature: Check products in shop



  @test @underConstruction
  Scenario Outline: Checking for accessoires
    Given I am on the Accessoires page
    When I open the product "<productname>" details
    Then I should see the "<productname>" with a price of "<price>"
    And The description should be "<description>"

    Examples:
      | productname                 | price   | description                                                         |
      | Mug The adventure begins    | € 11,90 | White Ceramic Mug. 325ml                                            |
      | Mug The best is yet to come | € 11,90 | White Ceramic Mug. 325ml                                            |
      | Mug Today is a good day     | € 11,90 | White Ceramic Mug. 325ml                                            |
      | Brown bear cushion          | € 18,90 | Cushion with removable cover and invisible zip on the back. 32x32cm |
