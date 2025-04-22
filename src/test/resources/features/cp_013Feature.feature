Feature: Validar cambio de nombre de columna 'Status de Pago'

  Scenario: Verificar columna 'Status de Pago' y cambio a 'Descripción Status Pago'
    Given la página de listado se muestra
    When identifico la columna originalmente denominada 'Status de Pago'
    Then la columna es localizada con los datos previos
    When verifico que el nombre se haya actualizado a 'Descripción Status Pago'
    Then el encabezado muestra 'Descripción Status Pago' y aparece en la posición indicada