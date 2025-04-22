Feature: Validate the new column 'Folio de Pago'

  Scenario: Verify insertion of 'Folio de Pago' column
    Given I am on the application page
    When I check the table headers
    Then I should see a column 'Folio de Pago' to the right of 'Folio Pre solicitud'
    And the 'Folio de Pago' column should be empty