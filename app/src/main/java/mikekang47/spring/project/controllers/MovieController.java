package mikekang47.spring.project.controllers;

import mikekang47.spring.project.dto.MoviesItem;
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
    String CLIENT_ID = "MY_CLIENTID";
    String CLIENT_SECRET = "MY_CLIENT_SECRET";

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
