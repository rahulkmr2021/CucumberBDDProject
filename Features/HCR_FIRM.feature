Feature: HCR Application

  Background: Steps common for all scenarios
    Given User Launch Chrome browser
    When User enters Url as "http://35.92.157.147/login"
    And User Enters Email as "admin@bc.com" and Password as "Password1!"
    And Click on Login

  @Sanity
  Scenario Outline: Add  New Firm Details
    When User clicks on Add Firm
    And User Enters "<FirmName>", "<Street_Address01>", "<Street_Address02>", "<City>", "<Zip>", "<Website>" and "<Phone>"
    And click on Save button
    Then User click search button
    And Click to Export all data to Excel button

    Examples: 
      | FirmName | Street_Address01 | Street_Address02 | City   | Zip   | Website                 | Phone      |
      | Pulsee   | 12BDCVc          | XYZa             | artewd | 99888 | https://www.google.com/ | 7654389099 |

  @Sanity01
  Scenario Outline: Update Firm Details
    When User clicks on Edit Firm
    And Enters update details "<FirmName01>", "<Street_Address011>", "<Street_Address022>", "<City01>","<Zip01>","<Website01>" and "<Phone01>"
    Then User click on Save button

    Examples: 
      | FirmName01 | Street_Address011 | Street_Address022 | City01   | Zip01 | Website01                 | Phone01    |
      | Pulse01    | 12BDCVyt          | XYZ123            | ard234@@ | 99999 | https://www.facebook.com/ | 7654345054 |

  @Sanity02
  Scenario Outline: Add Contact Details
    When User click on Edit Button
    And Click on Contacts
    And Click on Add Contacts
    Then User Enters  Contact Details "<FirstName>", "<LastName>","<Title>","<EmailAdd>","<Phone>","<Extension>","<Mobile>" and "<Contact_Notes>"
    And Click on Save button

    Examples: 
      | FirstName | LastName | Title | EmailAdd          | Phone      | Extension | Moblie     | Contact_Notes |
      | Abr123    | Kty5234  | Mr.   | xyzs650@gmail.com | 8888905564 |     77777 | 5674890456 | hi......      |

  @Sanity03
  Scenario Outline: Update Contact Details
    When User click on update Edit Button
    And Enters  Contact Details "<FirstName01>", "<LastName01>","<Title01>","<EmailAdd01>","<Phone01>" ,"<Extension01>","<Mobile01>" and "<Contact_Notes01>"
    Then Click on update Save button

    Examples: 
      | FirstName01 | LastName01 | Title01 | EmailAdd01        | Phone01    | Extension01 | Moblie01   | Contact_Notes01 |
      | rbr123      | Kty34      | Mrs.    | xyzs650@gmail.com | 8888905564 |       77777 | 5674890456 | hello......     |
