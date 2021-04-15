package mikekang47.spring.project.repository;

import mikekang47.spring.project.dto.MoviesItem;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.AsyncRestOperations;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieRepository {

    private RestTemplate restTemplate = new RestTemplate();

    String CLIENT_ID = "";
    String CLIENT_SECRET = "";

    public MoviesItem findAll(String text) {
        String URL = "https://openapi.naver.com/v1/search/movie?query=" + text;

        final HttpHeaders headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id", CLIENT_ID);
        headers.set("X-Naver-Client-Secret", CLIENT_SECRET);

        final HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(URL, HttpMethod.GET, entity, MoviesItem.class, text).getBody();
    }
}
