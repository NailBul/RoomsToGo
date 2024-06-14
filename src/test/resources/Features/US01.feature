Feature: Login-Shop-Logout E2E functionality


  Background:  As a user, I want to log in my RoomsToGo account so that I can shop

    Given user is on roomsToGo web page
    And user hits the login Link
    When user enters valid credentials
    Then user sees logged in message

  @wip @ui
  Scenario: As a user, I want to select a living room set from the Hot Buys and add it to cart
    Given user clicks hot buys banner
   And user can see the furniture on sale
    And user selects the color of the Drew & Jonathan living room set
    And user adds the item to cart
    Then user can see the cart


  @wip @ui
Scenario: As I user I want to delete all items in the cart and log out

  Given user clicks hot buys banner
  And user can see the furniture on sale
  And user selects the color of the Drew & Jonathan living room set
  And user adds the item to cart
  And user can see the cart
  But user removes the item
  Then user logs out



