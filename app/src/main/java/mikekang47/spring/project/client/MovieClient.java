package mikekang47.spring.project.client;

import lombok.RequiredArgsConstructor;
import mikekang47.spring.project.models.Movie;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@RequiredArgsConstructor
@Service
public class MovieClient {
    private final RestTemplate restTemplate = new RestTemplate();

    private final String CLIENT_ID = "mw9hX3kenx0K2E7pmIQ2";
    private final String CLIENT_SECRET = "lNoj6922yq";

    private final String NaverURL = "https://openapi.naver.com/v1/search/movie.json?query={keyword}";

    public Movie requestMovie(String keyword) {
        final HttpHeaders headers = new HttpHeaders();
        headers.set("X-Naver_Client-Id", CLIENT_ID);
        headers.set("X-Naver-Client-Secret", CLIENT_SECRET);

        final HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(NaverURL, HttpMethod.GET, entity, Movie.class, keyword).getBody();

    }
}
