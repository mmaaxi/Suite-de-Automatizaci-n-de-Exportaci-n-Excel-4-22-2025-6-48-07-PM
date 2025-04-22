Feature: Validate new column 'Folio Pre solicitud'

  Scenario: Check the presence and position of 'Folio Pre solicitud' column
    Given I am on the page with the column headers
    When I check the column immediately to the right of 'Ramo'
    Then I should see a column titled 'Folio Pre solicitud' in that position
    And the column should have no data or null values