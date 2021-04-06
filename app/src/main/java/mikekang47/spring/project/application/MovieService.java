package mikekang47.spring.project.application;

import mikekang47.spring.project.models.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {

    public List<Movie> getMoviesByTitle(String title) {
        return movieRepository.findByTitle(title);
    }
}
