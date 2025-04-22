Feature: Validar columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Verificar que la columna 'Monto acumulado Folio Reserva 5401' esté correctamente implementada
    Given el usuario está en la página de reservas
    When el usuario verifica que la columna 'Monto acumulado Folio Reserva 5401' está a la derecha de la columna 'Monto (reserva)'
    Then la columna 'Monto acumulado Folio Reserva 5401' aparece con el título correcto

  Scenario: Verificar la fórmula de suma acumulada en la columna 'Monto acumulado Folio Reserva 5401'
    Given el usuario está en la página de reservas
    When el usuario verifica la fórmula de suma acumulada en la columna 'Monto acumulado Folio Reserva 5401'
    Then el valor de cada fila refleja la suma acumulada esperada