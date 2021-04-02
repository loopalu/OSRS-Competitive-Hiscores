package ee.osrs.competitive.hiscores.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Service
public class RestService {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public String getUserMetaData(String userName) {
        String URL = "https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=";
        String requestURL = URL + userName.replace(' ', '+');

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(requestURL))
                .setHeader("User-Agent", "Java 11 HttpClient")
                .build();

        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        assert response != null;
        HttpHeaders headers = response.headers();
        headers.map().forEach((header, value) -> System.out.println(header + ":" + value));

        // System.out.println(response.statusCode());

        // System.out.println(response.body());

        return response.body();
    }
}