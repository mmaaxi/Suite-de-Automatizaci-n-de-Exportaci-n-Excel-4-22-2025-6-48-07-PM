Feature: Validar nueva columna 'Estado Código'

  Scenario: Verificar inserción de la columna 'Estado Código'
    Given el usuario está en la página que contiene la tabla
    When se revisa la posición inmediatamente a la derecha de la columna 'I'
    Then se debe encontrar una nueva columna con el encabezado 'Estado Código'