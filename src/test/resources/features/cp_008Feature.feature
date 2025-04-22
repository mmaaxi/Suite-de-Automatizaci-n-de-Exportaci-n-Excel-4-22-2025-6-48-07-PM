Feature: Validar columnas IVA exento e IVA retenido

  Scenario: Verificar la existencia y funcionalidad de las columnas 'IVA exento' e 'IVA retenido'
    Given el Excel está abierto
    When verifico la existencia de la columna 'IVA exento'
    Then la columna 'IVA exento' debe estar presente
    When verifico la existencia de la columna 'IVA retenido' e ingreso datos de prueba
    Then ambas columnas deben mostrar los montos correspondientes a IVA exento y retenido