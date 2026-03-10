package programs.apicall;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class RateLimitTester {

    private static final String URL = "http://localhost:8080/orders/create-order";
    private static final String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTc3MjMzOTU5NSwiZXhwIjoxNzcyMzQzMTk1LCJyb2xlcyI6WyJST0xFX1VTRVIiXX0.pRlEwAf1nBFGQXlpSOuFBUBjmG_qAjoE9tajWoanIk0";

    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .build();

        for (int i = 1; i <= 40; i++) {

            String jsonBody = """
                    {
                      "orderId": "order-100-1D",
                      "productId": "laptop dell v3",
                       "quantity": 40
                    }
                    """.formatted(i);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL))
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + TOKEN)
                    .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Request " + i +
                    " → Status: " + response.statusCode());

           // Thread.sleep(100); // small delay (optional)
        }
    }
}
