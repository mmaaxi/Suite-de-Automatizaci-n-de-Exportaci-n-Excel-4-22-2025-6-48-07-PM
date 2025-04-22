Feature: Validación de actualización en la columna 'estado' en un archivo Excel exportado

  Scenario: Verificar actualización de los campos de la columna 'estado'
    Given El usuario ha exportado un archivo Excel existente con la columna 'estado'
    When Identifico la columna 'estado' en el archivo Excel exportado
    Then La columna 'estado' presenta datos previos antes de la actualización
    When Verifico los valores y formato en la columna 'estado'
    Then La columna 'estado' muestra la actualización correcta en valores y formato