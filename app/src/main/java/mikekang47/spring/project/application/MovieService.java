package mikekang47.spring.project.application;

import mikekang47.spring.project.domain.MovieRepository;
import mikekang47.spring.project.models.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {

    private MovieRepository movieRepository;

    public List<Movie> getMoviesByKeyword(String keyword) {
        return movieRepository.findByKeyword(keyword);
    }

}
