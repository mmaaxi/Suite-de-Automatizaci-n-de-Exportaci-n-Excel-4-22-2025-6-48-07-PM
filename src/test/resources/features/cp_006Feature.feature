Feature: Validar cambio de nombre de columna 'Monto Acumulado Folio OPC'

  Scenario: Validar que la cabecera de la columna se haya actualizado a 'Monto Acumulado Folio OPC (2121)'
    Given el usuario está en la página con la tabla de datos
    When el usuario ubica la columna 'Monto Acumulado Folio OPC'
    Then la cabecera de la columna debe ser 'Monto Acumulado Folio OPC (2121)'