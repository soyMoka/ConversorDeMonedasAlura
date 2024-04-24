

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;

public class Api {
        private String apiUrl="https://v6.exchangerate-api.com/v6/";

        private String apiKey="e9394f00432ddeb7692ea5af";

        String getQuery(String base ) {
            return apiUrl + apiKey + "/latest/" + base;
        }
        //https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD

        String getData() throws IOException, InterruptedException {
            try{

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(this.getQuery("USD")))
                    .build();

                HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();


            }catch (NumberFormatException e) {
                return "Ocurrio un error: " + e;
            } catch (IllegalArgumentException e) {
                return "Error en la URI, verifique la dirección. " + e;
            } catch (Exception e) {
                return "Error: " + e;
            }


    }


}
