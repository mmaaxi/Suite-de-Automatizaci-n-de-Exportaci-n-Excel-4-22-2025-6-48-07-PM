Feature: Validar fórmula actualizada para 'Monto Acumulado Folio OPC (2121)' en movimiento 'pago'

  Scenario: Calcular el monto acumulado del movimiento 'pago' usando fórmula actualizada
    Given que el usuario ha exportado el archivo Excel correcto
    When el usuario localiza la celda correspondiente al movimiento 'pago'
    Then la celda es identificada correctamente
    When el usuario aplica la fórmula =Z4+AD5+AE5+AH5+AC5+AB5+AM5 e ingresa datos de prueba
    Then el resultado de la suma es correcto y coincide con el cálculo manual