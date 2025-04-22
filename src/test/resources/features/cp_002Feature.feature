Feature: Validate new key order in column C

  Scenario: Verify the content of column C in the exported Excel file
    Given the Excel file is exported
    When I locate column C in the Excel file
    Then the cell C2 and subsequent cells should show concatenated data
    And the content of the cell should follow the formula: =CONCATENATE(D2,'_',H2,'_',U2,'_',O2,'_',E2)