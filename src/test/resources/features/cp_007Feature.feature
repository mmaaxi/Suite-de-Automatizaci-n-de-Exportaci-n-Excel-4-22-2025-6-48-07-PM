Feature: Validar inclusión de nueva columna 'IVA 0%'

  Scenario: Verificar la columna 'IVA 0%' en archivo Excel exportado
    Given El archivo Excel es exportado desde el sistema
    When Busco la columna titulada 'IVA 0%'
    Then La columna 'IVA 0%' debería aparecer en la posición indicada

  Scenario: Verificar los datos de la columna 'IVA 0%'
    Given La columna 'IVA 0%' está presente en el archivo Excel
    When Verifico los montos en la columna
    Then Debería ver únicamente montos con tasa 0%