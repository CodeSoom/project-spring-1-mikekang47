package mikekang47.spring.project.application;

import lombok.RequiredArgsConstructor;
import mikekang47.spring.project.client.MovieClient;
import mikekang47.spring.project.domain.MovieRepository;
import mikekang47.spring.project.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.mockito.Mock;



@RequiredArgsConstructor
@Service
public class MovieService {
    private MovieClient movieClient;

    public MovieService(MovieClient movieClient) {
        this.movieClient = movieClient;
    }

    @Transactional(readOnly = true)
    public Movie getMoviesByKeyword(String keyword) {
        return movieClient.requestMovie(keyword);
    }

}
