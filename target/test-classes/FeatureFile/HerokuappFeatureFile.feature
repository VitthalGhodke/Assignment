Feature: Herokuapp Product Creation Listing Updating and Delation

  Scenario: Herokuapp Product Creation
    Given User is on the product page
    When User Creat a New Product
    Then Verify that the user created a new product
    And Close the Browser

  Scenario: Herokuapp Product Listing
    Given User is on the product page
    When User Listed the product
    Then Verify that the user listed the product
    And Close the Browser

  Scenario: Herokuapp Product Updating
    Given User is on the product page
    When User Update the product
    Then Verify that the user updated the product
    And Close the Browser
    
    Scenario: Herokuapp Product Delation
    Given User is on the product page
    When User Delet the product
    Then Verify that the user Deleted the product
    And Close the Browser