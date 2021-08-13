Feature: Verifying Adactin Hotel details
		
  Scenario Outline: Verifying hotel login with valid username and password
    Given User is on Adactin hotel website
    When User enter the valid "<userName>" and "<password>"
    And User click the login button
    Then User should verify the success message
    When User give a valid "<Location>","<Hotels>","<Room type>","<Number of rooms>","<check in date>","<check out date>","<adults per room>"and "<children per room>"
    And User click the search button
    Then User click the checkbox and Search button
    When User should enter some details like "<First Name>","<Last Name>","<Billing Address>","<credit card no>","<Credit card type>","<expiry month>","<expiry year>" and "<cvv>"
    Then User should click the Book now button
    Then User should verify the success message

    Examples: 
      | userName   | password | Location    | Hotels         | Room type    | Number of rooms | check in date | check out date | adults per room | children per room | First Name | Last Name | Billing Address   | credit card no   | Credit card type | expiry month | expiry year | cvv |
      | naveen1612 | 3TGGMW   | Sydney      | Hotel Creek    | Standard     | 1 - One         | 21/09/2021    | 25/09/2021     | 2 - Two         | 1 - One           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | VISA             | December     |        2021 | 123 |
      | naveen1612 | 3TGGMW   | Melbourne   | Hotel Sunshine | Double       | 1 - One         | 21/09/2021    | 25/09/2021     | 1 - One         | 2 - Two           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | Master card      | December     |        2021 | 123 |
      | naveen1612 | 3TGGMW   | Brisbane    | Hotel Hervey   | Deluxe       | 3 - Three       | 21/09/2021    | 25/09/2021     | 2 - Two         | 1 - One           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | American Express | December     |        2021 | 123 |
      | naveen1612 | 3TGGMW   | Adelaide    | Hotel Cornice  | Super Deluxe | 1 - One         | 21/09/2021    | 25/09/2021     | 2 - Two         | 1 - One           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | VISA             | December     |        2021 | 123 |
      | naveen1612 | 3TGGMW   | London      | Hotel Creek    | Standard     | 3 - Three       | 21/09/2021    | 25/09/2021     | 1 - One         | 2 - Two           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | Master card      | December     |        2021 | 123 |
      | naveen1612 | 3TGGMW   | New York    | Hotel Sunshine | Double       | 1 - One         | 21/09/2021    | 25/09/2021     | 2 - Two         | 1 - One           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | American Express | December     |        2021 | 123 |
      | naveen1612 | 3TGGMW   | Los Angeles | Hotel Cornice  | Deluxe       | 1 - One         | 21/09/2021    | 25/09/2021     | 1 - One         | 2 - Two           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | VISA             | December     |        2021 | 123 |
      | naveen1612 | 3TGGMW   | Paris       | Hotel Creek    | Super Deluxe | 3 - Three       | 21/09/2021    | 25/09/2021     | 2 - Two         | 1 - One           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | Master card      | December     |        2021 | 123 |
      | naveen1612 | 3TGGMW   | Sydney      | Hotel Cornice  | Standard     | 1 - One         | 21/09/2021    | 25/09/2021     | 2 - Two         | 1 - One           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | American Express | December     |        2021 | 123 |
      | naveen1612 | 3TGGMW   | Melbourne   | Hotel Sunshine | Double       | 2 - Two         | 21/09/2021    | 25/09/2021     | 1 - One         | 2 - Two           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | VISA             | December     |        2021 | 123 |
      

























      