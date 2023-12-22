@author_Amruta @regression
Feature: Job search results functionality
  As a user, I should be able to select options and search jobs

  @author_Amruta @regression
  Scenario Outline: VerifyJobSearchResultUsingDifferentDataSet
    Given I am on Home Page
    When  I enter job title "<jobTitle>"
    And   I enter location "<location>"
    And   I select distance "<distance>"
    Then  I click on moreSearchOptions Link
    And   I enter salaryMin "<salaryMin>"
    And   I enter salaryMax "<salaryMax>"
    And   I select salaryType "<salaryType>"
    And   I select jobType "<jobType>"
    Then  I click on Find Jobs button
    #And   I verify the result "<result>"
    Examples:
      | jobTitle          | location                     | distance | salaryMin | salaryMax | salaryType | jobType        | result                                          |
      | Tester            | Surrey                       | 10 miles | 30000     | 500000    | Per annum  | Permanent      | Permanent Tester jobs in Surrey                 |
      | Developer         | Basildon                     | 25 miles | 40000     | 60000     | Per annum  | Contract       | Contract Developer jobs in Basildon             |
      | Quality Engineer  | Edinburgh, City of Edinburgh | 10 miles | 40000     | 70000     | Per annum  | Temporaray     | Temporary Quality Engineer jobs in Edinburgh    |
      | Quality Assurance | London                       | 35 miles | 45000     | 75000     | Per annum  | Apprenticeship | Apprenticeship Quality Assurance jobs in London |
      | Test Engineer     | Derby                        | 10 miles | 25000     | 45000     | Per annum  | Part Time      | Part Time Test Engineer jobs in Derby           |
      | Test Analyst      | Edenbridge, Kent             | 25 miles | 25000     | 45000     | Per annum  | Permanent      | Permanent Test Analyst jobs in Edenbridge       |
      | Test Manager      | Hampshire                    | 35 miles | 35000     | 65000     | Per annum  | Permanent      | Permanent Test Manager jobs in Hampshire        |