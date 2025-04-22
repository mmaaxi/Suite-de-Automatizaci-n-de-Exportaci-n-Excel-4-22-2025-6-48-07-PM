Feature: Exportar Excel y validar modificaciones generales

  Scenario: Descargar y verificar archivo Excel modificado
    Given el usuario está en el módulo de Canned Reports > Module Claim > Report Code > Claim Accounting Report
    When el usuario ejecuta el flujo Submit > View Log > Agregar Folio > Descargar archivo de excel
    Then el archivo Excel se descarga correctamente y presenta las modificaciones definidas
    And el Excel muestra las modificaciones definidas en la historia de usuario