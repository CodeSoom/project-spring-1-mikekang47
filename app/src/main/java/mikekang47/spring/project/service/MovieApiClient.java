package mikekang47.spring.project.service;

import lombok.RequiredArgsConstructor;
import mikekang47.spring.project.dto.MoviesData;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class MovieApiClient {
    @Mock
    private  RestTemplate restTemplate;

    private final String CLIENT_ID = "mw9hX3kenx0K2E7pmIQ2";
    private final String CLIENT_SECRET = "lNoj6922yq";

    private final String OpenNaverMovieUrl = "https://openapi.naver.com/v1/search/movie.json?query{keyword}";

    public MoviesData requestMovie(String keyword) {
        final HttpHeaders headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id", CLIENT_ID);
        headers.set("X-Naver-Client-Secret", CLIENT_SECRET);

        final HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(OpenNaverMovieUrl, HttpMethod.GET, entity, MoviesData.class, keyword).getBody();

    }
}
