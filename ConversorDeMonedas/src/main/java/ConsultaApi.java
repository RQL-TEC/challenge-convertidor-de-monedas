import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    /**
     * Se conecta a la API de ExchangeRate para obtener las tasas de cambio
     * para una moneda específica.
     * @param codigoMoneda El código de la moneda base (ej. "USD", "BRL").
     * @return Un objeto Moneda con todas las tasas de conversión.
     */
    public Moneda obtenerTasasDeCambio(String codigoMoneda) {
        // Tu clave de API personal
        String apiKey = "736df5d1821943fd404661dc";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + codigoMoneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Usa Gson para convertir la respuesta JSON en un objeto de la clase Moneda
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            // Si algo falla, lanza una excepción para que la clase Principal la maneje
            throw new RuntimeException("Error al consultar la API: " + e.getMessage());
        }
    }
}