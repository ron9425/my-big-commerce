Feature: As user I want to Check the Functionality of cornerstone Demo


  Scenario Outline: User should navigate site and buy a product
    Given I am on homepage
    When I click on Kitchen tab
    Then I click on the product to buy
    And I click on add to chart
    And I click on Proceed to checkout
    And I verify the "<price>"
    And I agree with privacy policy
    And I enter email "<Email>"
    And I click on continue as guest
    And I enter First Name "<FirstName>"
    And I enter Last Name "<LastName>"
    And I enter Address "<Address>"
    And I enter City  "<city>"
    And I enter Postal Code "<PostCode>"
    And I enter Phone Number "<PhoneNumber>"
    And I click Continue
    And I enter Payment method
    And I click place order

    Examples:
      | price   | Email          | FirstName | LastName | Address         | city   | PostCode | PhoneNumber  |
      | $120.00 | ron1@gamil.com | Ron       | Lobo     | 101 london Road | London | UB99UB   | 078123456789 |

















