package mikekang47.spring.project.domain;

import mikekang47.spring.project.models.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findByKeyword(String keyword);
}
