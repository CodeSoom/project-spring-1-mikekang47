package mikekang47.spring.project.application;

import mikekang47.spring.project.dto.MoviesItem;
import mikekang47.spring.project.repository.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MoviesItem requestData(String text) {
        return movieRepository.findAll(text);
    }
}
