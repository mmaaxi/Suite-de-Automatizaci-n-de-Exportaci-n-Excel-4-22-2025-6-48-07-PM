Feature: Validar la nueva fórmula de la columna 'IVA Acumulado'

  Scenario: Validar fórmula de la columna 'IVA Acumulado' en archivo Excel exportado
    Given el archivo Excel exportado está abierto
    When selecciono la columna 'IVA Acumulado'
    Then la columna es seleccionada correctamente
    And verifico que la fórmula sume los montos de 'IVA 16%', 'IVA FRONTERIZO', 'IVA 0 %' e 'IVA EXENTO', excluyendo 'IVA retenido'
    And el cálculo refleja la suma correcta de los IVAs indicados