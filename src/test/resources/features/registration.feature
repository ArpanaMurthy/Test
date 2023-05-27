Feature: Registration the application

Scenario Outline: Registration process check

Given I navigate to the application registration page
When I entered the "<userName>","<password>","<confirmPassword>","<firstName>","<surName>","<idNumber>","<sasfinAccountNumber>"
Then I get the failure registration message

Examples:
|userName | password|confirmPassword|firstName|surName|idNumber      |sasfinAccountNumber|
|Arpana   | Arp@0102 |Arp@0102      |Arpana   |Sosle  | 8608011392182|1234567890         |


