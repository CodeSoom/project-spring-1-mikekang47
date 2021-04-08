package mikekang47.spring.project.domain;

import mikekang47.spring.project.models.Movie;


import java.util.Set;

public interface MovieRepository {
    Set<Movie> findByKeyword(String keyword);
}
