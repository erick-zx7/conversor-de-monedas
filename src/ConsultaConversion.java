import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public Moneda buscaMoneda(String base, String target, double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/15d734fbf02c5efa9c2abdd0/pair/"+base+"/"+target+"/"+cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se puede realizar la conversión: " + e.getMessage());
        }

    }
}
