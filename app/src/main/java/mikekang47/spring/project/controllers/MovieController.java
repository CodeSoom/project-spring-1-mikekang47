package mikekang47.spring.project.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/api")
public class MovieController {
    String CLIENT_ID = "mw9hX3kenx0K2E7pmIQ2";
    String CLIENT_SECRET = "lNoj6922yq";

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{text}")
    public MoviesItem getData(@PathVariable String text) {
        String URL = "https://openapi.naver.com/v1/search/movie?query=" + text;

        final HttpHeaders headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id", CLIENT_ID);
        headers.set("X-Naver-Client-Secret", CLIENT_SECRET);

        final HttpEntity<String> entity = new HttpEntity<>(headers);


        return restTemplate.exchange(URL, HttpMethod.GET, entity, MoviesItem.class, text).getBody();
    }


}
