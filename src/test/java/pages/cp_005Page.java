package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.List;

public class cp_005Page {

    WebDriver driver;

    public cp_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReservaPage() {
        driver.get("http://example.com/reservas");
    }

    public boolean isMontoAcumuladoColumnaALaDerecha() {
        // Implement logic to check that the 'Monto acumulado' column is to the right of 'Monto (reserva)' column
        return driver.findElement(By.xpath("//th[.='Monto (reserva)']/following-sibling::th[1]")).getText().equals("Monto acumulado Folio Reserva 5401");
    }

    public String getTituloDeLaColumnaAcumulada() {
        return driver.findElement(By.xpath("//th[.='Monto acumulado Folio Reserva 5401']")).getText();
    }

    public boolean checkSumaAcumuladaFormula() {
        // Logic to check each row's Monto acumulado is previous acumulado + current Monto reserva
        List<Integer> montos = getMontosReserva();
        List<Integer> acumulados = getMontosAcumulados();
        
        int sumaAnterior = 0;
        for (int i = 0; i < montos.size(); i++) {
            sumaAnterior += montos.get(i);
            if (sumaAnterior != acumulados.get(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean verificaSumaAcumuladaEnFilas() {
        return checkSumaAcumuladaFormula();
    }

    private List<Integer> getMontosReserva() {
        // Retrieve the list of 'Monto (reserva)' values from the table
        // This is a placeholder. Implement actual DOM traversal for values
        return List.of(100, 200, 300);
    }

    private List<Integer> getMontosAcumulados() {
        // Retrieve the list of 'Monto acumulado Folio Reserva 5401' values from the table
        // This is a placeholder. Implement actual DOM traversal for values
        return List.of(100, 300, 600);
    }
}