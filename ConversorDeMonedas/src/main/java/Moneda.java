import java.util.Map;

/**
 * Representa la estructura de la respuesta JSON de la API.
 * Un 'record' es una clase inmutable para almacenar datos.
 * Los nombres de los campos (base_code, conversion_rates) deben ser
 * idénticos a las claves del JSON.
 */
public record Moneda(String base_code,
                     Map<String, Double> conversion_rates) {
}