Feature: Validar nueva columna 'Status Pago Código'

  Scenario: Verificar columna 'Status Pago Código' en el Excel
    Given El documento Excel está abierto
    When Busco la columna 'Fecha de Pago'
    Then La columna 'Fecha de Pago' debería existir
    When Verifico la columna que está a la derecha de 'Fecha de Pago'
    Then La columna 'Status Pago Código' debería mostrarse en la posición correcta sin datos