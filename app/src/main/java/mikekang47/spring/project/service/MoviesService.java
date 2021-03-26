package mikekang47.spring.project.service;


import lombok.RequiredArgsConstructor;
import mikekang47.spring.project.dto.MoviesData;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MoviesService {
    private MovieApiClient movieApiClient;

    public MoviesData findByKeyword(String keyword) {
        return movieApiClient.requestMovie(keyword);
    }

}
