Feature: Job Search Test

  Scenario Outline: User can search job using different data set
    Given I am on homepage
    When  I accept the cookies by clicking on acceptcookies
    And   I enter "<jobTitle>" in the job title field
    And   I enter the "<location>" in the location field
    And   I enter the "<distance>" in the distance field
    And   I click on more search option link
    And   I enter "<salaryMin>" in the min salary field
    And   I enter "<salaryMax>" in the max salary field
    And   I enter "<salaryType>" in the salary type field
    And   I enter "<jobType>" in the job type field
    And   I click on find jobs button
    Then  I can see the "<result>" on the page

    Examples:

      | jobTitle        | location                           | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                      |
      | Tester          | Harrow on the Hill, Greater London | up to 5 miles  | 30000     | 500000    | annum      | Permanent | Permanent Tester jobs in Harrow on the Hill |
      | Test Technician | London                             | up to 25 miles | 30000     | 50000     | annum      | Permanent | Permanent Test Technician jobs in London    |
      | Test Manager    | London                             | up to 15 miles | 35000     | 500000    | annum      | Permanent | Permanent Test Manager jobs in London       |
      | Tester          | Luton                              | up to 5 miles  | 2000      | 8000      | month      | Permanent | Permanent Tester jobs in Luton              |
      | Tester          | Luton                              | up to 25 miles | 30000     | 40000     | annum      | Permanent | Permanent Tester jobs in Luton              |
