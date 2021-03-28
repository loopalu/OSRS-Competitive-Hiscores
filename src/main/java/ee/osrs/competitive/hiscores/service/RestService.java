package ee.osrs.competitive.hiscores.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getUserMetaData(String userName) {
        String URL = "https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=";
        String requestURL = URL + userName.replace(' ', '+');
        return this.restTemplate.getForObject(requestURL, String.class);
    }
}